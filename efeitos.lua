local efeitos = {}

efeitos.lista = {}

function efeitos:aplicar(carta, entidade, baralho)
    local efeito = self.lista[carta]
    if efeito then
        efeito(entidade, baralho)
    end
end

efeitos.lista["O Louco"] = function(entidade, baralho)
    print("[Efeito] Compre duas cartas sem se preocupar com o estouro. Mas cuidado: se sair ileso, perde imediatamente.")

    entidade:comprarCartaSemArcanoMaior(baralho)
    entidade:comprarCartaSemArcanoMaior(baralho)
    entidade.ignorar_estouro = true

    if entidade.pontuacao <= 33 then
        print("[Efeito] Você saiu ileso... mas O Louco leva tudo. Você perdeu!")
        entidade.estourou = true
    end
end

efeitos.lista["O Mago"] = function(entidade)
    print("[Efeito] Canalize sua vontade: escolha um valor entre 2 e 11 para somar à sua pontuação.")
    local valor
    repeat
        io.write("Escolha um valor entre 2 e 11 (buff): ")
        valor = tonumber(io.read())
    until valor and valor >= 2 and valor <= 11
    entidade.buff = entidade.buff + valor
end

efeitos.lista["A Sacerdotisa"] = function(entidade, baralho)
    print("[Efeito] Com um olhar além do véu, revele a próxima carta do baralho.")
    local proxima = baralho:verProximaCarta()
    print("Próxima carta será: " .. proxima)
end

efeitos.lista["A Imperatriz"] = function(entidade, baralho)
    print("[Efeito] Dissipa todos os **debuffs** do jogador e ignora um possível estouro, como um gesto de graça.")
    entidade.debuff = 0
    entidade.ignorar_estouro = true 
end

return efeitos