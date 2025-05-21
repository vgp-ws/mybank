docker compose down -v
rem docker compose down

docker rmi exchangemybank-exchange:latest -f
docker rmi exchangemybank-psql-keycloak:latest -f

cd ..

call .\mvnw clean verify

cd exchange.mybank

docker compose --env-file ./compose.env up -d