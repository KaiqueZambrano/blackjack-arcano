local entidade = {}

function entidade:comprarCarta(baralho)
    table.insert(self.mao, baralho:puxar())
end

function entidade:calcularMao()
    local valorMao = 0
    local ases = 0

    for _, carta in ipairs(self.mao) do
        if carta:match("^[2-9]") then
            valorMao = valorMao + tonumber(carta:match("([2-9])"))
        elseif carta:match("10") then
            valorMao = valorMao + 10 
        elseif carta:match("Valete") or carta:match("Rainha") or carta:match("Rei") or carta:match("Cavaleiro") then
            valorMao = valorMao + 10
        elseif carta:match("Ás") then
            valorMao = valorMao + 11
            ases = ases + 1
        elseif carta:match("O Louco") then valorMao = valorMao + 0
        elseif carta:match("O Mago") then valorMao = valorMao + 1
        elseif carta:match("A Sacerdotisa") then valorMao = valorMao + 2
        elseif carta:match("A Imperatriz") then valorMao = valorMao + 3
        elseif carta:match("O Imperador") then valorMao = valorMao + 4
        elseif carta:match("O Hierofante") then valorMao = valorMao + 5
        elseif carta:match("Os Amantes") then valorMao = valorMao + 6
        elseif carta:match("O Carro") then valorMao = valorMao + 7
        elseif carta:match("A Força") then valorMao = valorMao + 8
        elseif carta:match("O Eremita") then valorMao = valorMao + 9
        elseif carta:match("A Roda da Fortuna") then valorMao = valorMao + 10
        elseif carta:match("A Justiça") then valorMao = valorMao + 11
        elseif carta:match("O Enforcado") then valorMao = valorMao + 12
        elseif carta:match("A Morte") then valorMao = valorMao + 13
        elseif carta:match("A Temperança") then valorMao = valorMao + 14
        elseif carta:match("O Diabo") then valorMao = valorMao + 15
        elseif carta:match("A Torre") then valorMao = valorMao + 16
        elseif carta:match("A Estrela") then valorMao = valorMao + 17
        elseif carta:match("A Lua") then valorMao = valorMao + 18
        elseif carta:match("O Sol") then valorMao = valorMao + 19
        elseif carta:match("O Julgamento") then valorMao = valorMao + 20
        elseif carta:match("O Mundo") then valorMao = valorMao + 21
        end
    end

    while valorMao > 50 and ases > 0 do
        valorMao = valorMao - 10
        ases = ases - 1
    end

    return valorMao
end

function entidade:obterCartas(baralho)
    self.mao = {}
    self:comprarCarta(baralho)
    self:comprarCarta(baralho)
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