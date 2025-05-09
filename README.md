# Blackjack Arcano

> Projeto desenvolvido para a disciplina **Comunicação Organizacional (EC46DB)**

## Regras de Negócio

### Objetivo
O objetivo do jogo é somar o valor das cartas e chegar o mais próximo possível de 50 pontos, **sem ultrapassá-los** (ou seja, sem **estourar**).

### Cartas
- Cartas **numéricas** e os **Arcanos Maiores** possuem valor igual ao seu número.
- As cartas **Cavaleiro**, **Rainha**, **Rei** e **Valete** valem **10 pontos** cada.
- O **Ás** pode valer **1 ponto** ou **11 pontos**, dependendo do que for mais vantajoso para a mão.
- Os **Arcanos Maiores**, exceto quando puxados na primeira rodada, ativam **efeitos especiais** que influenciam a partida.

| Nº    | Arcano Maior          | Efeito Especial                                                                                       | Tempo de Ativação |
| ----- | --------------------- | ----------------------------------------------------------------------------------------------------- | ----------------- |
| 0     | **O Louco**           | Permite comprar duas cartas sem risco de estouro nesta rodada.                                        | Imediato          |
| I     | **O Mago**            | Permite *buffar* (aumentar) a pontuação em um valor entre 2 e 11.                                     | Imediato          |
| II    | **A Sacerdotisa**     | Revela a próxima carta do baralho.                                                                    | Imediato          |
| III   | **A Imperatriz**      | Remove todos os *debuffs* (efeitos negativos).                                                        | Imediato          |
| IV    | **O Imperador**       | Em caso de empate, o jogador (ou dealer) é declarado vencedor.                                        | Passiva           |
| V     | **O Hierofante**      | Permite trocar uma carta da mão por uma nova.                                                         | Imediato          |
| VI    | **Os Amantes**        | Permite a troca de uma carta entre o dealer e o jogador.                                              | Imediato          |
| VII   | **O Carro**           | Permite comprar duas cartas simultaneamente.                                                          | Imediato          |
| VIII  | **A Justiça**         | Todos revelam suas mãos. O jogador com a maior pontuação vence.                                       | Imediato          |
| IX    | **O Eremita**         | Permite devolver uma carta comprada ao fundo do baralho.                                              | Imediato          |
| X     | **A Roda da Fortuna** | Ativa um efeito aleatório: comprar uma carta, dobrar a aposta ou receber um *debuff* de 10 pontos.    | Imediato          |
| XI    | **A Força**           | Anula o efeito do próximo Arcano Maior ativado.                                                       | Passiva           |
| XII   | **O Enforcado**       | Substitui toda a mão do jogador por duas novas cartas e **O Enforcado**.                              | Imediato          |
| XIII  | **A Morte**           | Permite remover até três cartas da mão.                                                               | Imediato          |
| XIV   | **A Temperança**      | Impede que o jogador estoure uma única vez (a última carta comprada é devolvida ao fundo do baralho). | Passiva           |
| XV    | **O Diabo**           | Concede um *buff* ou *debuff* aleatório entre -10 e +20 pontos.                                       | Imediato          |
| XVI   | **A Torre**           | Todos os jogadores descartam aleatoriamente uma carta de suas mãos.                                   | Imediato          |
| XVII  | **A Estrela**         | Se o jogador ultrapassar 50 pontos nesta rodada, recebe um *debuff* proporcional ao excesso.          | Passiva           |
| XVIII | **A Lua**             | Repete o efeito do último Arcano Maior ativado.                                                       | Imediato          |
| XIX   | **O Sol**             | Revela todas as cartas em jogo.                                                                       | Imediato          |
| XX    | **O Julgamento**      | Troca a mão do jogador com a do dealer (ou vice-versa).                                               | Imediato          |
| XXI   | **O Mundo**           | Garante vitória automática se o jogador (ou dealer) tiver 40 ou mais pontos na mão atual.             | Imediato          |

### Como Jogar
1. O jogador realiza sua aposta.
2. As cartas são embaralhadas.
3. O jogador e o dealer recebem duas cartas cada.
4. O jogador escolhe entre **Hit** (comprar uma carta) ou **Stand** (manter a mão atual).
5. Se o jogador **estourar** (ultrapassar 50 pontos), sofre **derrota imediata**.
6. Caso escolha **Stand**, o dealer comprará cartas até atingir, no mínimo, 40 pontos.
7. Se o dealer **estourar**, o jogador obtém **vitória imediata**.
8. Caso contrário, a pontuação é comparada, e vence quem tiver mais pontos.
