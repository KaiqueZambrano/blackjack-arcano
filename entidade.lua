local entidade = {}
entidade.__index = entidade

function entidade:comprarCarta(baralho)
    table.insert(self.mao, baralho:puxar())
end

function entidade:comprarCartaSemArcanoMaior(baralho)
    table.insert(self.mao, baralho:puxarSemArcanoMaior())
end

function entidade:calcularMao()
    local valor_mao = 0
    local ases = 0

    for _, carta in ipairs(self.mao) do
        if carta:match("^[2-9]") then
            valor_mao = valor_mao + tonumber(carta:match("([2-9])"))
        elseif carta:match("10") then
            valor_mao = valor_mao + 10 
        elseif carta:match("Valete") or carta:match("Rainha") or carta:match("Rei") or carta:match("Cavaleiro") then
            valor_mao = valor_mao + 10
        elseif carta:match("Ás") then
            valor_mao = valor_mao + 11
            ases = ases + 1
        end
    end

    while valor_mao > 50 and ases > 0 do
        valor_mao = valor_mao - 10
        ases = ases - 1
    end

    return valor_mao
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
