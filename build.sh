#!/bin/bash

## Build imagem do banco com interface grafica
docker pull postgres
docker pull dpage/pgadmin4

## Criando rede local para o projeto
docker network create --driver bridge analise-network

## Build Back-End
sudo docker build -t analise-credito analise-credito/.
## Build Front-End
sudo docker build -t analise-credito-core analise-credito-core/.
