#!/bin/bash

## Start Banco de Dados e Interface Grafica
docker run --name docker-postgresql --network=analise-network -e "POSTGRES_PASSWORD=Postgres2018!" -p 5432:5432 -v /home/${USER}/Desenvolvimento/PostgreSQL:/var/lib/postgresql/data -d postgres
docker run --name docker-pgadmin --network=analise-network -p 15432:80 -e "PGADMIN_DEFAULT_EMAIL=teste" -e "PGADMIN_DEFAULT_PASSWORD=PgAdmin2018!" -d dpage/pgadmin4

## Start Projects
sudo docker-compose -p analise-projects -f analise-projects.yml up -d
