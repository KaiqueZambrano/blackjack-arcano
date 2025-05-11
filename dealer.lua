local dealer = {}
local entidade = require("entidade")

setmetatable(dealer, entidade)

dealer.mao = {}
dealer.pontuacao = 0
dealer.buff = 0
dealer.debuff = 0
dealer.estourou = false

function dealer:rodadaDoDealer(baralho)
    while self.pontuacao < 27 do
        self:comprarCartaSemArcanoMaior(baralho)
        self.pontuacao = self:calcularMao()

        if self.pontuacao > 33 then
            self.estourou = true
        end
    end
end

return dealer
