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

    for _, carta in ipairs(self.mao) do
        if carta:match("^%d+") then
            valor = valor + tonumber(carta:match("^%d+"))
        elseif carta:match("Ás") then
            valor = valor + 11
            ases = ases + 1
        elseif carta:match("Valete") or carta:match("Rainha") or carta:match("Rei") or carta:match("Cavaleiro") then
            valor = valor + 10
        end
    end

    while valor > 50 and ases > 0 do
        valor = valor - 10
        ases = ases - 1
    end

    return valor + (self.buff or 0) - (self.debuff or 0)
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
