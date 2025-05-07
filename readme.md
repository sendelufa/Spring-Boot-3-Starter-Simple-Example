# Пример создания Spring Boot стартер для Spring Boot 3

1. Собрать проект

```bash
./mvnw clean install
```

Windows:

```shell
mvnw.cmd clean install
```

2. Запустить проект

```bash
./mvnw spring-boot:run -pl demo-application
```

Windows:

```shell
mvnw.cmd spring-boot:run -pl demo-application
```

⚠️ Как вариант, отключить автоконфигурацию и попробовать запустить.
В этом случае ожидаемо получим ошибку, так как бин не будет найден.

```bash
./mvnw clean install \
  spring-boot:run -pl demo-application \
  -Dspring-boot.run.arguments="--example.starter.enabled=false"
```

Ошибка:

```text
Consider defining a bean of type 
'com.example.starter.autoconfigure.ExampleService'
in your configuration.
```

⚠️ Если возникает ошибка, убедитесь, что пересобран модуль `example-starter-autoconfigure`.

Это можно сделать командой:

```bash
./mvnw clean install -pl example-starter-autoconfigure
```

или пересобрать полностью проект

```bash
./mvnw clean install
```

