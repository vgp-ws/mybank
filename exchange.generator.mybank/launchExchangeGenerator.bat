docker compose down -v
rem docker compose down


docker rmi exchangegeneratormybank-gateway:latest -f
docker rmi exchangegeneratormybank-exchange:latest -f
docker rmi exchangegeneratormybank-exchange.generator:latest -f
docker rmi exchangegeneratormybank-psql-keycloak:latest -f

cd ..

call .\mvnw clean verify

cd exchange.generator.mybank

docker compose --env-file ./compose.env up -d