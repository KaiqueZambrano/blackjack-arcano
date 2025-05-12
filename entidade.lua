local entidade = {}
local efeitos = require("efeitos")

function entidade:comprarCarta(baralho)
    self.ignorar_estouro = false
    local carta = baralho:puxar()
    table.insert(self.mao, carta)
    efeitos:aplicar(carta, self, baralho)
end

function entidade:comprarCartaSemArcanoMaior(baralho)
    self.ignorar_estouro = false
    local carta = baralho:puxarSemArcanoMaior()
    table.insert(self.mao, carta)
end

function entidade:calcularMao()
    local valor = 0
    local ases = 0
    local ranks = {}
    local naipes = {}
    local cartasPorNaipe = {}

    local rank_valores = {
        ["Ás"] = 14,
        ["2"] = 2, ["3"] = 3, ["4"] = 4, ["5"] = 5, ["6"] = 6,
        ["7"] = 7, ["8"] = 8, ["9"] = 9, ["10"] = 10,
        ["Valete"] = 11, ["Cavaleiro"] = 12, ["Rainha"] = 13, ["Rei"] = 13.5
    }

    for _, carta in ipairs(self.mao) do
        local rank, naipe = carta:match("([^ ]+) de ([^ ]+)")
        rank = rank or carta:match("^%d+")

        if rank and naipe then
            if rank:match("^%d+$") then
                valor = valor + tonumber(rank)
            elseif rank == "Ás" then
                valor = valor + 11
                ases = ases + 1
            elseif rank_valores[rank] then
                valor = valor + 10
            end

            ranks[rank] = (ranks[rank] or 0) + 1
            naipes[naipe] = (naipes[naipe] or 0) + 1

            cartasPorNaipe[naipe] = cartasPorNaipe[naipe] or {}
            table.insert(cartasPorNaipe[naipe], rank_valores[rank] or tonumber(rank))
        end
    end

    while valor > 50 and ases > 0 do
        valor = valor - 10
        ases = ases - 1
    end

    local bonus = 0
    local valores = {}

    for rank, _ in pairs(ranks) do
        table.insert(valores, rank_valores[rank] or tonumber(rank))
    end
    table.sort(valores)

    local function temSequencia(valores)
        table.sort(valores)
        local count = 1
        for i = 2, #valores do
            if valores[i] == valores[i-1] + 1 then
                count = count + 1
                if count >= 3 then
                    return true
                end
            elseif valores[i] ~= valores[i-1] then
                count = 1
            end
        end
        return false
    end

    local isSequencia = temSequencia(valores)

    local isCor = false
    for _, count in pairs(naipes) do
        if count >= 3 then
            isCor = true
            break
        end
    end

    local isSequenciaCor = false
    for _, lista in pairs(cartasPorNaipe) do
        if #lista >= 3 and temSequencia(lista) then
            isSequenciaCor = true
            break
        end
    end

    if isSequenciaCor then
        bonus = bonus + 4
    else
        if isSequencia then bonus = bonus + 2 end
        if isCor then bonus = bonus + 2 end
    end

    for _, count in pairs(ranks) do
        if count == 2 then
            bonus = bonus + 1
        elseif count == 3 then
            bonus = bonus + 3
        end
    end

    return valor + (self.buff or 0) - (self.debuff or 0) + bonus
end

function entidade:obterCartas(baralho)
    self.mao = {}
    self:comprarCartaSemArcanoMaior(baralho)
    self:comprarCartaSemArcanoMaior(baralho)
    self.pontuacao = self:calcularMao()
end

function entidade:imprimirMao()
    for _, carta in ipairs(self.mao) do
        print(carta)
    end
end

function entidade:imprimirPontuacao()
    print(self.pontuacao)
end

return entidade