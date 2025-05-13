# Blackjack Arcano

> Projeto desenvolvido para a disciplina **Comunicação Organizacional (EC46DB)**

![Logo](assets/logo.png)

## Metas dos desenvolvedores
- Criar um jogo de cartas simples e estratégico, **inspirado no blackjack**.
- Desenvolver o jogo para plataforma de computador (Windows/Linux/Mac).
- Equilibrar sorte e habilidade, **recompensando boas decisões do jogador**.
- Integrar um sistema de pontuação que mescla elementos do **blackjack** e do **pôquer**.
- Introduzir cartas com **efeitos especiais** que trazem variedade e imprevisibilidade ao jogo.

## Objetivos do jogo
- Somar o valor das cartas para chegar o mais próximo possível de **33 pontos**, sem ultrapassar esse limite.
- Formar **combinações** para ganhar **bônus de pontuação** e aumentar o retorno da **aposta**.
- Usar os **efeitos especiais** das cartas a seu favor para influenciar o resultado da rodada.

> A rodada termina quando o jogador decide "parar" (**stand**) ou **estoura** (ultrapassa 33 pontos).

## Diferenças do blackjack tradicional
- O objetivo é alcançar **33 pontos**, em vez de **21**.
- **Combinações** (pares, trincas, sequências e cartas do mesmo naipe) também contribuem para a pontuação final.
- É possível **apostar em uma combinação** a qualquer momento (desde que antes de obtê-la), assim como **devolver um número limitado de cartas**.
- A opção de **"Seguro"** não está disponível para o jogador.
- O jogador poderá manter, no máximo, cinco cartas em sua mão.
- Apenas as cartas do jogador são reveladas; as do dealer permanecem ocultas.
- Utiliza-se um **baralho de tarô**, em vez do tradicional **baralho francês**:

| Característica   | Baralho Francês         | Baralho de Tarô                |
| ---------------- | ----------------------- | ------------------------------ |
| Nº de cartas     | 52 (ou 54 com curingas) | 78                             |
| Figuras          | Valete, Dama, Rei       | Valete, Cavaleiro, Rainha, Rei |
| Arcanos Maiores  | ❌ Não tem              | ✅ Tem (22 cartas únicas)      |

- As *cartas únicas* do Tarô (**"O Mago", "A Morte", "O Diabo",** etc) podem ativar **efeitos especiais**, levando o jogador a tomar **decisões estratégicas** influenciadas pela **sorte**.

> Algumas cartas possuem ativação **passiva**, enquanto as cartas com ativação **voluntária** dependem da escolha do jogador.

## Cartas

### Arcanos Menores
- Cartas **numéricas** têm valor igual ao número que representam.
- As cartas **Valete**, **Cavaleiro**, **Rainha** e **Rei** valem **10 pontos** cada.
- O Ás pode valer **1 ponto** ou **11 pontos**, conforme o que for mais vantajoso para a mão do jogador.

### Arcanos Maiores
- **Arcanos Maiores** *não possuem valor numérico*, mas podem ativar **efeitos especiais** que influenciam o andamento da rodada:

| Nº    | Arcano Maior          | Efeito Especial                                                                                                                                                     | Ativação   |
| ----- | --------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| 0     | **O Louco**           | Compre uma carta sem se preocupar com o estouro, mas cuidado: se sair ileso, a jornada termina aqui.                                                                | Voluntária |
| I     | **O Mago**            | Canalize sua vontade: escolha um valor entre 2 e 5 para receber um **buff** na pontuação.                                                                           | Voluntária |
| II    | **A Sacerdotisa**     | Com um olhar além do véu, revele as três cartas seguintes, vislumbrando o futuro.                                                                                   | Voluntária |
| III   | **A Imperatriz**      | Dissipe os **debuffs** e ignore o estouro desta rodada como um gesto de graça.                                                                                      | Voluntária |
| IV    | **O Imperador**       | Uma vez por partida, impose a ordem: ignore o estouro e devolva a última carta comprada ao baralho.                                                                 | Automática |
| V     | **O Hierofante**      | Com sabedoria ancestral, troque uma carta da sua mão por uma nova.                                                                                                  | Voluntária |
| VI    | **Os Amantes**        | O destino coloca à sua frente duas opções: escolha uma carta para manter, a outra se perde.                                                                         | Voluntária |
| VII   | **O Carro**           | Avance com determinação: compre uma carta e, se desejar, recuse-a para buscar uma nova.                                                                             | Voluntária |
| VIII  | **A Justiça**         | A balança da equidade pesa: se a diferença entre sua pontuação e a do dealer for de até 3 pontos, a vitória é compartilhada.                                        | Automática |
| IX    | **O Eremita**         | Em silêncio e meditação, devolva uma carta comprada ao baralho, refletindo sobre o que foi escolhido.                                                               | Voluntária |
| X     | **A Roda da Fortuna** | O destino gira: dobre sua aposta em vitória, dobre-a em derrota ou sofra um **debuff** de 5 pontos.                                                                 | Automática |
| XI    | **A Força**           | Com sua força interior, anule o efeito do próximo Arcano Maior ativado.                                                                                             | Voluntária |
| XII   | **O Enforcado**       | Em um sacrifício, receba 3 pontos de **debuff** e substitua toda a sua mão por duas novas cartas.                                                                   | Voluntária |
| XIII  | **A Morte**           | Devolva três cartas aleatórias da sua mão ao baralho, encerrando um ciclo. Se não houver cartas suficientes, receba um **debuff** de 5 pontos.                      | Voluntária |
| XIV   | **A Temperança**      | Com moderação, escolha um valor entre 2 e 5 para receber um **debuff** na pontuação, equilibrando a balança do destino.                                             | Voluntária |
| XV    | **O Diabo**           | Ousada escolha: dobre sua aposta em vitória, mas pague o triplo em derrota, ou receba um **buff** ou **debuff** aleatório entre -10 e +20 pontos.                   | Voluntária |
| XVI   | **A Torre**           | O caos se instala: reduza sua aposta pela metade, descarte uma carta e receba um **debuff** de 10 pontos.                                                           | Automática |
| XVII  | **A Estrela**         | Sob a proteção das estrelas, ignore o estouro na próxima rodada. Se perder, pague apenas metade da aposta.                                                          | Automática |
| XVIII | **A Lua**             | Sob o véu do mistério, repita o efeito do último Arcano Maior ativado. Se nenhum efeito anterior ocorreu, o destino decide: vitória ou derrota, guiados pela sorte. | Automática |
| XIX   | **O Sol**             | Sob a luz do Sol, se você vencer, receberá 50% a mais; se perder, pagará 50% a menos.                                                                               | Automática |
| XX    | **O Julgamento**      | No momento do julgamento, se você perder, a partida será reiniciada, oferecendo uma nova chance.                                                                    | Automática |
| XXI   | **O Mundo**           | Com a harmonia do universo, garante vitória automática se a pontuação for maior ou igual a 27.                                                                      | Automática |

> **Buffs** são aumentos na pontuação, enquanto **debuffs** representam reduções.

## Bônus de pontuação
Além da soma das cartas, certas **combinações** garantem **bônus adicionais de pontuação**. Quando utilizadas em apostas, essas combinações também aplicam 
multiplicadores ao valor apostado:

| Combinação           | Requisitos                                      | Bônus de Pontuação | Multiplicador (em aposta) |
| -------------------- | ----------------------------------------------- | ------------------ | ------------------------- |
| **Par**              | Duas cartas do mesmo valor.                     | +1 pontos          | x1.25                     |
| **Trinca**           | Três cartas do mesmo valor.                     | +3 pontos          | x3                        |
| **Sequência**        | Três cartas em sequência.                       | +2 pontos          | x1.5                      |
| **Cor**              | Três cartas do mesmo naipe.                     | +2 pontos          | x1.5                      |
| **Sequência de Cor** | Três cartas em sequência do mesmo naipe.        | +4 pontos          | x4                        |

### Hierarquia para as combinações:

| Carta      | Valor ordinal (para combinações) |
| ---------- | -------------------------------- |
| Ás         | 1.                               |
| 2–10       | 2 a 10.                          |
| Valete     | 11.                              |
| Cavaleiro  | 12.                              |
| Rainha     | 13.                              |
| Rei        | 14.                              |
| Ás         | 15.                              |

## Apostas
- É possível apostar que você conseguirá formar uma **combinação** (par, trinca, sequência, cor ou sequência de cor).
- É permitido realizar **apenas uma única aposta** por rodada.
- A aposta deve ser feita **antes** de completar a combinação — em qualquer momento da rodada até lá.
- Caso a combinação seja alcançada até o final da rodada, você recebe um **multiplicador de retorno** proporcional à combinação escolhida.

> Os multiplicadores obtidos por apostas **se acumulam** com os efeitos de cartas especiais, como **A Roda da Fortuna** ou **O Diabo**.

## Como Jogar
1. O jogador realiza sua **aposta inicial**.
2. As cartas são **embaralhadas**.
3. O jogador e o dealer recebem **duas cartas** cada.
4. O jogador escolhe entre as seguintes opções:
    - **Hit**: Comprar uma carta.
        - O jogador pode ter até cinco cartas na mão. 
    - **Drop**: Descartar uma carta.
        - O jogador pode descartar até cinco cartas por rodada. 
    - **Spell**: Usar um Arcano Maior de ativação voluntária.
        - A carta utilizada será devolvida ao baralho. 
        - É permitido usar no máximo três arcanos por rodada.
    - **Stand**: Manter a mão atual.
    - **Bet**: Apostar em uma combinação de par, trinca, sequência, cor ou sequência de cor.
5. Se o jogador **estourar** (ultrapassar 33 pontos), sofrerá **derrota imediata**.
6. Se o jogador escolher **Stand**, o dealer continuará comprando cartas até atingir, no mínimo, 27 pontos.
7. Se o dealer **estourar**, o jogador conquista **vitória imediata**.
8. Caso contrário, as pontuações são comparadas e vence quem tiver a **maior pontuação**.

> O dealer não pode comprar Arcanos Maiores.