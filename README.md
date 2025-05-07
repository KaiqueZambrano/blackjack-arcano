# Blackjack Arcano

> Projeto desenvolvido para a disciplina **Comunicação Organizacional (EC46DB)**

## Regras de Negócio

### Objetivo
O objetivo do jogo é somar o valor das cartas e chegar o mais próximo possível de 33 pontos, **sem ultrapassá-los** (ou seja, sem **estourar**).

### Cartas
- Cartas **numéricas** têm valor igual ao seu número.
- As cartas **Pajem**, **Cavaleiro**, **Rainha** e **Rei** valem **10 pontos** cada.
- O **Ás** vale **11 pontos**.
- **Arcanos Maiores** *não possuem valor numérico*, mas ativam **efeitos especiais** que influenciam a partida.

| Nº    | Arcano Maior          | Efeito Especial                                                                                      | Tempo de Ativação |
| ----- | --------------------- | ---------------------------------------------------------------------------------------------------- | ----------------- |
| 0     | **O Louco**           | Permite comprar uma carta sem risco de estouro nesta rodada.                                         | Imediato          |
| I     | **O Mago**            | Permite alterar o valor de uma carta para um número aleatório entre 2 e 11.                          | Imediato          |
| II    | **A Sacerdotisa**     | Revela a próxima carta do baralho.                                                                   | Imediato          |
| III   | **A Imperatriz**      | Compra uma carta com valor -3.                                                                       | Imediato          |
| IV    | **O Imperador**       | Em caso de empate, o jogador (ou dealer) vence.                                                      | Passiva           |
| V     | **O Hierofante**      | Permite trocar uma carta da mão por uma nova carta.                                                  | Imediato          |
| VI    | **Os Amantes**        | Troca uma carta entre o dealer e o jogador.                                                          | Imediato          |
| VII   | **O Carro**           | Permite comprar duas cartas de uma vez.                                                              | Imediato          |
| VIII  | **A Justiça**         | Todos revelam suas mãos. O jogador com maior pontuação vence.                                        | Imediato          |
| IX    | **O Eremita**         | Devolve a última carta comprada ao fundo do baralho.                                                 | Imediato          |
| X     | **A Roda da Fortuna** | Ativa um efeito aleatório: comprar uma nova carta, dobrar a aposta ou perder 5 pontos.               | Imediato          |
| XI    | **A Força**           | Anula o efeito do próximo Arcano Maior.                                                              | Passiva           |
| XII   | **O Enforcado**       | Substitui toda a mão do jogador por duas novas cartas.                                               | Imediato          |
| XIII  | **A Morte**           | Permite remover até três cartas da mão do jogador.                                                   | Imediato          |
| XIV   | **A Temperança**      | Permite cancelar o valor de uma carta jogada.                                                        | Imediato          |
| XV    | **O Diabo**           | Compra uma carta com valor aleatório entre -10 e +20.                                                | Imediato          |
| XVI   | **A Torre**           | Todos os jogadores descartam uma carta aleatória de suas mãos.                                       | Imediato          |
| XVII  | **A Estrela**         | A pontuação é zerada caso exceda 33 pontos.                                                          | Passiva           |
| XVIII | **A Lua**             | Repete o efeito do último Arcano Maior ativado.                                                      | Imediato          |
| XIX   | **O Sol**             | Revela todas as cartas em jogo.                                                                      | Imediato          |
| XX    | **O Julgamento**      | Troca a mão do jogador com a do dealer (ou vice-versa).                                              | Imediato          |
| XXI   | **O Mundo**           | Garante vitória automática se o jogador (ou dealer) tiver 27 ou mais pontos na mão atual.            | Imediato          |

### Como Jogar
1. O jogador realiza sua aposta.
2. As cartas são embaralhadas.
3. O jogador e o dealer recebem duas cartas cada.
4. O jogador escolhe entre **Hit** (comprar uma carta) ou **Stand** (manter a mão atual).
5. Se o jogador **estourar** (ultrapassar 33 pontos), sofre **derrota imediata**.
6. Caso escolha **Stand**, o dealer comprará cartas até atingir, no mínimo, 27 pontos.
7. Se o dealer **estourar**, o jogador obtém **vitória imediata**.
8. Caso contrário, a pontuação é comparada, e vence quem tiver mais pontos.
