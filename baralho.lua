local baralho = {}

baralho.cartas = {}

function baralho:criar()
    local naipes = {"Copas", "Espadas", "Ouros", "Paus"}
    local valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Ás", 
                     "Cavaleiro", "Rainha", "Rei", "Valete"}
    
    for _, naipe in ipairs(naipes) do
        for _, valor in ipairs(valores) do
            table.insert(self.cartas, valor .. " de " .. naipe)
        end
    end

    table.insert(self.cartas, "O Louco")
    table.insert(self.cartas, "O Mago")
    table.insert(self.cartas, "A Sacerdotisa")
    table.insert(self.cartas, "A Imperatriz")
    table.insert(self.cartas, "O Imperador")
    table.insert(self.cartas, "O Hierofante")
    table.insert(self.cartas, "Os Enamorados")
    table.insert(self.cartas, "O Carro")
    table.insert(self.cartas, "A Força")
    table.insert(self.cartas, "O Eremita")
    table.insert(self.cartas, "A Roda da Fortuna")
    table.insert(self.cartas, "A Justiça")
    table.insert(self.cartas, "O Pendurado")
    table.insert(self.cartas, "A Morte")
    table.insert(self.cartas, "A Temperança")
    table.insert(self.cartas, "O Diabo")
    table.insert(self.cartas, "A Torre")
    table.insert(self.cartas, "A Estrela")
    table.insert(self.cartas, "A Lua")
    table.insert(self.cartas, "O Sol")
    table.insert(self.cartas, "O Julgamento")
    table.insert(self.cartas, "O Mundo")
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

return baralho