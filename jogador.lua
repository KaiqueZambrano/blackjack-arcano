local jogador = {}
local entidade = require("entidade")

setmetatable(jogador, entidade)

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
    self.aposta = 2 * self.aposta
end

function jogador:hit(baralho)
    self:comprarCarta(baralho)
    self.pontuacao = self:calcularMao()

    if self.pontuacao > 33 then
        self.estourou = true
    end
end

function jogador:stand()
    self.parou = true
end

return jogador
