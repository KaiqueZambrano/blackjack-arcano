#!/bin/bash

# Mapeamento de nomes por extenso para números
declare -A mapa=(
  ["um-de-"]="1-de-"
  ["dois-de-"]="2-de-"
  ["tres-de-"]="3-de-"
  ["quatro-de-"]="4-de-"
  ["cinco-de-"]="5-de-"
  ["seis-de-"]="6-de-"
  ["sete-de-"]="7-de-"
  ["oito-de-"]="8-de-"
  ["nove-de-"]="9-de-"
  ["dez-de-"]="10-de-"
)

for file in *; do
  newname="$file"
  for extenso in "${!mapa[@]}"; do
    novo="${mapa[$extenso]}"
    newname="${newname//$extenso/$novo}"
  done
  if [[ "$file" != "$newname" ]]; then
    echo "Renomeando: '$file' → '$newname'"
    mv -- "$file" "$newname"
  fi
done
