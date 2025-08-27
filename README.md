# CarStore

Projeto Spring Boot simples que fornece uma lista de carros em JSON e um front-end básico em HTML que consome esse JSON.

## Estrutura do projeto

```
carstore/
├─ src/
│  ├─ main/
│  │  ├─ java/br/com/carstore/controller/IndexController.java
│  │  └─ java/br/com/carstore/model/Car.java
│  └─ resources/
│     └─ static/index.html
├─ pom.xml
└─ README.md

```

## Endpoints

- `GET /car`  
  Retorna uma lista de carros em JSON.
```
  [
  { "name": "fusca", "color": "Amarelo" },
  { "name": "gol", "color": "Preto" }
]
```



## Como rodar o projeto

1. **Certifique-se de que o `Java 17` e o `Maven` estão instalados**

2. **Compile e rode o projeto:**
   ```sh
   mvn clean package
    mvn spring-boot:run

   ```

3. **Acesse o endpoint no navegador:**
   ```sh
   http://localhost:8080/car
   ```

   Você verá um JSON com os carros cadastrados

## Requisitos

- Java 17+
- Maven

---