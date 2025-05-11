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

    local arcanos_maiores = {
        "O Louco", "O Mago", "A Sacerdotisa", "A Imperatriz", "O Imperador", 
        "O Hierofante", "Os Amantes", "O Carro", "A Força", "O Eremita", 
        "A Roda da Fortuna", "A Justiça", "O Enforcado", "A Morte", 
        "A Temperança", "O Diabo", "A Torre", "A Estrela", "A Lua", 
        "O Sol", "O Julgamento", "O Mundo"
    }

    for _, arcano in ipairs(arcanos_maiores) do
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
    local arcanos_maiores = {
        ["O Louco"] = true, ["O Mago"] = true, ["A Sacerdotisa"] = true, ["A Imperatriz"] = true,
        ["O Imperador"] = true, ["O Hierofante"] = true, ["Os Amantes"] = true, ["O Carro"] = true,
        ["A Força"] = true, ["O Eremita"] = true, ["A Roda da Fortuna"] = true, ["A Justiça"] = true,
        ["O Enforcado"] = true, ["A Morte"] = true, ["A Temperança"] = true, ["O Diabo"] = true,
        ["A Torre"] = true, ["A Estrela"] = true, ["A Lua"] = true, ["O Sol"] = true,
        ["O Julgamento"] = true, ["O Mundo"] = true
    }

    local cartas_sem_arcano_maior = {}
    for _, carta in ipairs(self.cartas) do
        if not arcanos_maiores[carta] then
            table.insert(cartas_sem_arcano_maior, carta)
        end
    end

    if #cartas_sem_arcano_maior > 0 then
        local carta_escolhida = cartas_sem_arcano_maior[math.random(#cartas_sem_arcano_maior)]
        for i, carta in ipairs(self.cartas) do
            if carta == carta_escolhida then
                return table.remove(self.cartas, i)
            end
        end
    end

    return nil
end

return baralho
