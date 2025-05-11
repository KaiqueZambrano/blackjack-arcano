local baralho = {}

local NAIPES = {"Copas", "Espadas", "Ouros", "Paus"}
local VALORES = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                 "Valete", "Cavaleiro", "Rainha", "Rei", "Ás"}

local ARCANOS_MAIORES = {
    "O Louco", "O Mago", "A Sacerdotisa", "A Imperatriz", "O Imperador", 
    "O Hierofante", "Os Amantes", "O Carro", "A Força", "O Eremita", 
    "A Roda da Fortuna", "A Justiça", "O Enforcado", "A Morte", 
    "A Temperança", "O Diabo", "A Torre", "A Estrela", "A Lua", 
    "O Sol", "O Julgamento", "O Mundo"
}

local ARCANOS_SET = {}
for _, nome in ipairs(ARCANOS_MAIORES) do
    ARCANOS_SET[nome] = true
end

baralho.cartas = {}

function baralho:criar()
    self.cartas = {}
    for _, naipe in ipairs(NAIPES) do
        for _, valor in ipairs(VALORES) do
            table.insert(self.cartas, valor .. " de " .. naipe)
        end
    end

    for _, arcano in ipairs(ARCANOS_MAIORES) do
        table.insert(self.cartas, arcano)
    end
end

function baralho:embaralhar()
    for i = #self.cartas, 2, -1 do
        local j = math.random(i)
        self.cartas[i], self.cartas[j] = self.cartas[j], self.cartas[i]
    end
end

function baralho:puxar()
    return table.remove(self.cartas)
end

function baralho:puxarSemArcanoMaior()
    for i = #self.cartas, 1, -1 do
        if not ARCANOS_SET[self.cartas[i]] then
            return table.remove(self.cartas, i)
        end
    end
    return nil
end

function baralho:verProximaCarta()
    return self.cartas[#self.cartas] or "nenhuma carta restante"
end

return baralho