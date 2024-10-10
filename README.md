# Getting Started

### Как собрать
```shell
mvn clean build
```

### Как стартануть приложение
```shell
java -jar target/ot-social-0.0.1-SNAPSHOT.jar
```
или при помощи мавен-плагина или при помощи кнопки в идее

### Настройки приложения
В основном стандартные.
Для работы приложения понадобится БД Postgresql. Настройки можно поправить.
```
url: jdbc:postgresql://localhost:5432/postgres
password: password
username: postgres
```
flyway при перовом запуске сам создаст таблицы если схема будет пустой, 
иначе - приложение не стартанет.

Из кастомных - раздел jwt.

Методы, работающие без аутентификации указываются здесь:
ru.ot.social.config.SecurityConfiguration

/login, /user/register

### БД Postgresql
Использовал образ postgres:16.4-alpine3.20
cacb1dffe4c26bc4bbd060ae2b710899ad8888017dd485b46bfff7e1cecb7d9f
устанавливал через docker desktop
в будущих версиях постараюсь сделать с помощью spring-boot-docker-compose

### Тесты
JUnit 5
мб позже(

### Коллекция postman
Лежит в проекте 
[OTUS Highload Architect.postman_collection-2024-10-11.json](OTUS Highload Architect.postman_collection-2024-10-11.json)

метод {{baseUrl}}/login
после успешного вызова сохраняет токен

в результате для методов
- {{baseUrl}}/user/get/:id

не нужно предпринимать дополнительных действий для подсовывания токена
достаточно подставить данные для запроса и нажать send

### Генератор классов
```shell
java -jar modules/swagger-codegen-cli/target/swagger-codegen-cli.jar generate \
-i /home/.../ot-social/src/main/resources/openapi.json \
-l spring \
-o ./samples/server/ot-social \
-c /home/.../ot-social/src/main/resources/swagger-codegen-config.json
```
