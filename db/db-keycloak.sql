CREATE EXTENSION IF NOT EXISTS dblink;

DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_database WHERE datname = 'keycloak_db') THEN
        -- Если база данных не существует, выполняем CREATE DATABASE вне блока
        PERFORM dblink_exec('dbname=' || current_database(), 
            'CREATE DATABASE keycloak_db
             WITH ENCODING=''UTF8''
             OWNER=keycloak_user
             LC_COLLATE=''ru_RU.UTF-8''
             LC_CTYPE=''ru_RU.UTF-8''
             CONNECTION LIMIT=-1
             TABLESPACE=pg_default;');
    END IF;
END $$;