local jogador = {}
local entidade = require("entidade")

setmetatable(jogador, { __index = entidade })

jogador.aposta = 0
jogador.mao = {}
jogador.pontuacao = 0
jogador.buff = 0
jogador.debuff = 0
jogador.estourou = false
jogador.parou = false

function jogador:fazerAposta(valor)
    self.aposta = valor
end

function jogador:dobrarAposta()
    self.aposta = self.aposta * 2
end

function jogador:hit(baralho)
    self:comprarCarta(baralho)
    self.pontuacao = self:calcularMao()

    if self.pontuacao > 33 and not self.ignorar_estouro then
        if self.o_imperador then
            print("O estouro foi evitado. A última carta foi devolvida ao baralho.")
            local ultima_carta = table.remove(self.mao)
            baralho:devolver(ultima_carta)
            self.pontuacao = self:calcularMao()
            self.o_imperador = false
        else
            self.estourou = true
        end
    end
end

function jogador:stand()
    self.parou = true
end

return jogador
