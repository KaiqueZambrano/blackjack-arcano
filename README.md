# Blackjack Arcano

> Projeto desenvolvido para a disciplina **Comunicação Organizacional (EC46DB)**

## Regras de Negócio

### Objetivo
O objetivo do jogo é somar o valor das cartas e chegar o mais próximo possível de 33 pontos, **sem ultrapassá-los** (isto é, sem **estourar**).

### Cartas
- Cartas **numéricas** têm valor igual ao número que representam.
- As cartas **Valete**, **Cavaleiro**, **Rainha** e **Rei** valem **10 pontos** cada.
- O **Ás** pode valer **1 ponto** ou **11 pontos**, conforme o que for mais vantajoso para a mão do jogador.
- **Arcanos Maiores** *não possuem valor numérico*, mas ativam **efeitos especiais** que influenciam a partida.

| Nº    | Arcano Maior          | Efeito Especial                                                                                            | Tempo de Ativação |
| ----- | --------------------- | ---------------------------------------------------------------------------------------------------------- | ----------------- |
| 0     | **O Louco**           | Compre duas cartas sem se preocupar com o estouro. Mas cuidado: se sair ileso, perde imediatamente.        | Imediato          |
| I     | **O Mago**            | Canalize sua vontade: escolha um valor entre 2 e 11 para somar à sua pontuação (**buff**).                 | Imediato          |
| II    | **A Sacerdotisa**     | Com um olhar além do véu, revele a próxima carta do baralho.                                               | Imediato          |
| III   | **A Imperatriz**      | Dissipa todos os **debuffs** do jogador e ignora um possível estouro, como um gesto de graça.              | Imediato          |
| IV    | **O Imperador**       | Uma vez por partida, imponha ordem: ignore o estouro e retorne a última carta comprada ao baralho.         | Passiva           |
| V     | **O Hierofante**      | Com sabedoria ritual, escolha uma carta da sua mão e troque por uma nova.                                  | Imediato          |
| VI    | **Os Amantes**        | O destino oferece duas opções de carta: escolha uma para manter, a outra é descartada.                     | Imediato          |
| VII   | **O Carro**           | Avance com determinação: compre uma carta e, se desejar, recuse-a para comprar outra.                      | Imediato          |
| VIII  | **A Justiça**         | A balança se equilibra: todos revelam suas mãos e o jogador com a maior pontuação é declarado vencedor.    | Imediato          |
| IX    | **O Eremita**         | Em silêncio e reflexão, devolva uma carta comprada ao baralho.                                             | Imediato          |
| X     | **A Roda da Fortuna** | O destino gira: triplique sua aposta em vitória, dobre-a em derrota ou sofra um **debuff** de 5 pontos.    | Imediato          |
| XI    | **A Força**           | Com sua força interior, anule o efeito do próximo Arcano Maior ativado.                                    | Passiva           |
| XII   | **O Enforcado**       | Em um sacrifício, toda a mão do jogador é substituída por duas novas cartas.                               | Imediato          |
| XIII  | **A Morte**           | Três cartas aleatórias são devolvidas da mão ao fundo do baralho, marcando o fim de um ciclo.              | Imediato          |
| XIV   | **A Temperança**      | Com equilíbrio, diminua sua pontuação em um valor entre 2 e 11 (**debuff**).                               | Imediato          |
| XV    | **O Diabo**           | Ousada escolha: triplique sua aposta em vitória, pague o dobro em derrota, receba um **buff** ou **debuff** aleatório entre -10 e +20 pontos, ou devolva a carta ao fundo do baralho.                                                                                              | Imediato          |
| XVI   | **A Torre**           | O caos se instala: a aposta é reduzida pela metade. Descarte uma carta e receba um **debuff** de 10 pontos.| Imediato          |
| XVII  | **A Estrela**         | Sob a proteção das estrelas, ignore o estouro na próxima rodada. Se perder, pague apenas metade da aposta. | Passiva           |
| XVIII | **A Lua**             | Sob o véu do mistério, repita o efeito do último Arcano Maior ativado. Se nenhum efeito anterior ocorreu, o destino decide: vitória ou derrota, guiados pela sorte.                                                                                                                 | Imediato          |
| XIX   | **O Sol**             | Sob a luz do Sol, se o jogador ganhar, recebe 50% a mais; se perder, paga 50% a menos.                     | Imediato          |
| XX    | **O Julgamento**      | No momento do julgamento, se o jogador perder, a partida é reiniciada, oferecendo uma nova chance.         | Imediato          |
| XXI   | **O Mundo**           | Com a harmonia do universo, garante vitória automática.                                                    | Imediato          |

### Como Jogar
1. O jogador realiza sua aposta.
2. As cartas são embaralhadas.
3. O jogador e o dealer recebem duas cartas cada.
4. O jogador escolhe entre **Hit** (comprar uma carta) ou **Stand** (manter a mão atual).
5. Se o jogador **estourar** (ultrapassar 33 pontos), sofre **derrota imediata**.
6. Caso escolha **Stand**, o dealer comprará cartas até atingir, no mínimo, 27 pontos.
7. Se o dealer **estourar**, o jogador obtém **vitória imediata**.
8. Caso contrário, compara-se a pontuação, e vence quem tiver mais pontos.

### Restrições
1. Nenhuma das cartas distribuídas no início do jogo pode ser um Arcano Maior.
2. O dealer não pode comprar Arcanos Maiores.
3. Todas as cartas devolvidas devem ser retornadas ao fundo do baralho.

### Observações
1. As cartas compradas por arcanos maiores são sempre numéricas.