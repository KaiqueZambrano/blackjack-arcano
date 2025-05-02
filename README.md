# Blackjack Arcano

> Projeto desenvolvido para a disciplina **Comunicação Organizacional (EC46DB)**

## Regras de Negócio

### Objetivo
O objetivo do jogo é somar o valor das cartas o mais próximo possível de 21, sem ultrapassar esse valor (não **estourar**).

### Cartas
- Cartas **numéricas** têm o valor correspondente ao seu número.
- As cartas **Pajem**, **Cavaleiro**, **Rainha** e **Rei** valem **10 pontos**.
- O **Ás** pode valer **1** ou **11 pontos**, dependendo do que for mais vantajoso para o jogador.
- **Arcanos Maiores** *não têm valor numérico*, mas ativam **efeitos especiais** que influenciam o jogo.

| Nº    | Arcano Maior          | Efeito Especial                                                                                    | Tempo de Ativação |
| ----- | --------------------- | -------------------------------------------------------------------------------------------------- | ----------------- |
| 0     | **O Louco**           | Ignora o estouro na próxima rodada.                                                                | Passiva           |
| I     | **O Mago**            | Permite alterar o valor de uma carta para um valor aleatório entre 2 e 11.                         | Imediato          |
| II    | **A Sacerdotisa**     | Torna visível a próxima carta do baralho.                                                          | Imediato          |
| III   | **A Imperatriz**      | Subtrai três pontos da pontuação total do jogador.                                                 | Imediato          |
| IV    | **O Imperador**       | O jogador ganha em caso de empate.                                                                 | Passiva           |
| V     | **O Hierofante**      | Permite substituir uma carta da mão por uma nova carta.                                            | Imediato          |
| VI    | **Os Amantes**        | Troca uma carta do dealer com uma carta do jogador (ou vice-versa).                                | Imediato          |
| VII   | **O Carro**           | Compra duas cartas de uma vez, permitindo escolher uma delas para ficar na mão.                    | Imediato          |
| VIII  | **A Justiça**         | Todos os jogadores revelam suas mãos. O jogador com a maior pontuação vence.                       | Imediato          |
| IX    | **O Eremita**         | Devolve a última carta comprada ao baralho.                                                        | Imediato          |
| X     | **A Roda da Fortuna** | Recebe um efeito aleatório: compra uma nova carta, dobra a aposta ou perde 5 pontos.               | Imediato          |
| XI    | **A Força**           | Permite reduzir ou aumentar o valor de uma carta em até cinco pontos, mantendo o mínimo de 1 ponto.| Imediato          |
| XII   | **O Enforcado**       | Troca toda a mão do jogador por duas novas cartas (arcanos menores).                               | Imediato          |
| XIII  | **A Morte**           | Permite eliminar uma carta (arcano menor) da mão do jogador.                                       | Imediato          |
| XIV   | **A Temperança**      | Divide o valor de uma carta (arcano menor) por dois, arredondando para cima.                       | Imediato          |
| XV    | **O Diabo**           | Compra uma carta com valor aleatório entre -5 e +15.                                               | Imediato          |
| XVI   | **A Torre**           | Todos os jogadores descartam uma carta aleatória de sua mão.                                       | Imediato          |
| XVII  | **A Estrela**         | Compra uma carta extra sem risco (permite descartar a carta).                                      | Imediato          |
| XVIII | **A Lua**             | Repete o efeito do último Arcano Maior ativado.                                                    | Imediato          |
| XIX   | **O Sol**             | Revela todas as cartas em jogo (mãos dos jogadores e do dealer).                                   | Imediato          |
| XX    | **O Julgamento**      | Troca a mão do jogador com a mão do dealer (ou vice-versa).                                        | Imediato          |
| XXI   | **O Mundo**           | Vitória automática se o jogador (ou dealer) tiver 21 ou mais pontos na mão atual.                  | Imediato          |

### Como Jogar
1. O jogador faz sua aposta.
2. As cartas são embaralhadas.
3. O jogador e o dealer recebem duas cartas cada, sendo que o jogador pode ver apenas a primeira carta do dealer.
4. O jogador escolhe entre **Hit** (comprar uma carta) ou **Stand** (manter a mão atual).
5. O dealer compra cartas até atingir no mínimo 17 pontos.
6. O jogo segue até que o jogador ou o dealer estoure (ultrapasse 21 pontos), ou o jogador escolha **Stand**.
7. Se o jogador ou o dealer tiverem 21 pontos, o jogo termina.
