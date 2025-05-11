math.randomseed(os.time())

local baralho = require("baralho")
local jogador = require("jogador")
local dealer = require("dealer")

local function imprimirEstadoJogador()
    print("Cartas na mão do jogador:")
    jogador:imprimirMao()
    print()

    print("Pontuação do jogador:")
    jogador:imprimirPontuacao()
    print()
end

local aposta
repeat
    io.write("Faça uma aposta: ")
    aposta = tonumber(io.read())
until aposta and aposta > 0

jogador:fazerAposta(aposta)

baralho:criar()
baralho:embaralhar()
jogador:obterCartas(baralho)
dealer:obterCartas(baralho)

print("====================================================")
print("Começo do jogo!")
print("====================================================")

while not jogador.estourou and not jogador.parou do 
    imprimirEstadoJogador()

    io.write("(H)it ou (S)tand? ")
    local escolha = string.lower(io.read())

    if escolha == "h" then
        jogador:hit(baralho)
    elseif escolha == "s" then
        jogador:stand()
    else
        print("Opção inválida. Digite 'H' para Hit ou 'S' para Stand.")
    end

    print("====================================================")
end

if jogador.estourou then
    print("Você perdeu! R$ " .. tostring(jogador.aposta))
    os.exit()
end

dealer:rodadaDoDealer(baralho)

print("Cartas na mão do dealer:")
dealer:imprimirMao()
print()

print("Pontuação final do dealer:")
dealer:imprimirPontuacao()
print()

print("====================================================")

if dealer.estourou or jogador.pontuacao > dealer.pontuacao then
    print("Você ganhou! R$ " .. tostring(jogador.aposta))
elseif jogador.pontuacao < dealer.pontuacao then
    print("Você perdeu! R$ " .. tostring(jogador.aposta))
else
    print("Empate.")
end