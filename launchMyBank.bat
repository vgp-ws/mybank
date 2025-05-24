docker compose down -v
rem docker compose down

docker rmi mybank-accounts:latest -f
docker rmi mybank-template:latest -f
docker rmi mybank-front:latest -f
docker rmi mybank-gateway:latest -f
docker rmi mybank-exchange:latest -f
docker rmi mybank-exchange.generator:latest -f
docker rmi mybank-psql-keycloak:latest -f
docker rmi mybank-psql-bank:latest -f

call .\mvnw clean verify

docker compose --env-file ./compose.env up -d