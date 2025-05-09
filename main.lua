math.randomseed(os.time())

local baralho = require("baralho")
local jogador = require("jogador")

print("Faça uma aposta: ")
local aposta = io.read("*n")
io.read()

if aposta then
    jogador:fazerAposta(aposta)
end

baralho:criar()
baralho:embaralhar()
jogador:obterCartas(baralho)

print("====================================================")
print("Começo do jogo!")
print("====================================================")

while not jogador.estourou and not jogador.parou do 
    print("Pontuação: ")
    jogador:imprimirPontuacao()
    
    print(" ")

    print("Cartas na mão do jogador: ")
    jogador:imprimirMao()
    
    print(" ")

    print("(H)it ou (S)tand?")
    local hitOuStand = io.read()

    if string.lower(hitOuStand) == "h" then
        jogador:hit(baralho)
    elseif string.lower(hitOuStand) == "s" then
        jogador:stand()
    end
    
    print("====================================================")
end

if jogador.estourou then
    print("Jogador perdeu R$ " .. tostring(jogador.aposta))
    os.exit()
end