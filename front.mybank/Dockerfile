# Используем базовый образ с Java
FROM alpine/java:21-jdk

# Указываем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем JAR-файл в контейнер
COPY target/front.mybank-0.0.1-SNAPSHOT.jar front.mybank.jar

# Открываем порт, на котором будет работать приложение
EXPOSE 8080
