math.randomseed(os.time())

local baralho = require("baralho")
local jogador = require("jogador")
local dealer = require("dealer")

local function imprimirEstado(jogador)
    print("Pontuação do jogador: ")
    jogador:imprimirPontuacao()
    print()

    print("Cartas na mão do jogador: ")
    jogador:imprimirMao()
    print()
end

print("Faça uma aposta: ")
local aposta = io.read("*n")
io.read()

if aposta then
    jogador:fazerAposta(aposta)
end

baralho:criar()
baralho:embaralhar()
jogador:obterCartas(baralho)
dealer:obterCartas(baralho)

print("====================================================")
print("Começo do jogo!")
print("====================================================")

while not jogador.estourou and not jogador.parou do 
    imprimirEstado(jogador)

    io.write("(H)it ou (S)tand? ")
    local escolha = string.lower(io.read())

    if escolha == "h" then
        jogador:hit(baralho)
    elseif escolha == "s" then
        jogador:stand()
    end

    print("====================================================")
end

if jogador.estourou then
    print("Jogador perdeu R$ " .. tostring(jogador.aposta))
    os.exit()
end

dealer:rodadaDoDealer(baralho)

print("Pontuação final do dealer: ")
dealer:imprimirPontuacao()
print()

print("Cartas na mão do dealer: ")
dealer:imprimirMao()
print()

print("====================================================")

local pontuacaoJogador = jogador.pontuacao + jogador.buff - jogador.debuff
local pontuacaoDealer = dealer.pontuacao + dealer.buff - dealer.debuff

if dealer.estourou or pontuacaoJogador > pontuacaoDealer then
    print("Jogador ganhou R$ " .. tostring(jogador.aposta))
elseif pontuacaoJogador < pontuacaoDealer then
    print("Jogador perdeu R$ " .. tostring(jogador.aposta))
else
    print("Empate")
end