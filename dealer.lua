local dealer = {}
local entidade = require("entidade")

setmetatable(dealer, { __index = entidade })

dealer.mao = {}
dealer.pontuacao = 0
dealer.buff = 0
dealer.debuff = 0
dealer.estourou = false
dealer.parou = false

function dealer:rodadaDoDealer(baralho)
    while self.pontuacao < 45 do
        self:comprarCarta(baralho)
        self.pontuacao = self:calcularMao()

        if self.pontuacao > 50 then
            self.estourou = true
        end
    end

    self.parou = true
end

return dealer