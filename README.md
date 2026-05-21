# CHECKPOINT 3 - JAVA ADVANCED

## Integrantes

- Natalia Cristina de Souza - RM: 564099
- Nickolas Davi Silva Souza - RM: 564105
- Samara de Oliveira Vilela - RM: 566133
- Rodrigo Carvalho Silva - RM: 565162

---

# Sobre o Projeto

Projeto desenvolvido em Java utilizando Spring Boot para criação de uma API REST de gerenciamento de brinquedos para crianças até 14 anos.

A aplicação realiza operações de CRUD integradas ao banco Oracle Database, utilizando persistência com Spring Data JPA, Validation Beans e documentação/testes através do Swagger OpenAPI.

---

# Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Validation Beans
- Swagger / OpenAPI
- Oracle Database
- Maven
- IntelliJ IDEA
- Oracle SQL Developer
- Swagger UI
- Apache Tomcat (localhost:8080)

---

# Estrutura do Projeto

O projeto foi organizado utilizando arquitetura em camadas:

- Controller
- Service
- Repository
- Model

Pacotes principais:

```text
controller
service
repository
model
resources
```

---

# Banco de Dados

Banco Oracle utilizado para persistência dos dados.

Tabela utilizada:

```sql
TDS_TB_BRINQUEDOS
```

Colunas obrigatórias:

```text
ID
NOME
TIPO
CLASSIFICACAO
TAMANHO
PRECO
```

---

# Configuração Oracle

Arquivo:

```properties
application.properties
```

Configuração utilizada:

```properties
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Persistência realizada utilizando Spring Data JPA.

---

# Repository

Foi utilizado Repository através da interface:

```java
JpaRepository<Brinquedo, Long>
```

A utilização do JpaRepository permite:

- Inserção de registros
- Consulta por ID
- Consulta geral
- Atualização
- Exclusão
- Persistência simplificada

---

# Validation Beans

Foram aplicadas validações utilizando Validation Beans nos atributos da entidade Brinquedo.

Exemplos:

- Campos obrigatórios
- Validação de valores
- Controle de integridade dos dados

As validações foram executadas automaticamente durante operações POST e PUT.

---

# Swagger OpenAPI

Foi implementado Swagger OpenAPI para documentação e realização dos testes dos endpoints.

Dependência utilizada:

```xml
<dependency>
    <groupId>org.springdoc</groupId>

<artifactId>
springdoc-openapi-starter-webmvc-ui
</artifactId>

<version>2.8.8</version>

</dependency>
```

Acesso realizado através:

```http
http://localhost:8080/swagger-ui/index.html
```

---

# Operações CRUD

Foram realizados testes completos utilizando Swagger UI contemplando:

CREATE

```http
POST /brinquedos
```

READ GERAL

```http
GET /brinquedos
```

READ POR ID

```http
GET /brinquedos/{id}
```

UPDATE

```http
PUT /brinquedos/{id}
```

DELETE

```http
DELETE /brinquedos/{id}
```

Todos os testes foram realizados utilizando:

```http
localhost:8080
```

---

# Exemplo JSON POST

```json
{
 "nome":"Lego Minecraft",
 "tipo":"Blocos",
 "classificacao":"8 anos",
 "tamanho":"Médio",
 "preco":199.90
}
```

---

# Exemplo JSON PUT

```json
{
 "nome":"Lego Minecraft Deluxe",
 "tipo":"Blocos",
 "classificacao":"10 anos",
 "tamanho":"Grande",
 "preco":249.90
}
```

---

# Evidências Implementadas

## Swagger UI

- CRUD funcionando
- GET por ID
- DELETE
- Retorno 404 após exclusão
- Documentação automática

---

## Oracle SQL Developer

Comandos utilizados:

```sql
DESC TDS_TB_BRINQUEDOS;
```

```sql
SELECT * FROM TDS_TB_BRINQUEDOS;
```

---

## Spring Initializr

Projeto criado utilizando:

- Maven
- Java
- Spring Web
- Spring Data JPA
- Validation
- Oracle Driver

---

## IDE Utilizada

IntelliJ IDEA

---

# Arquitetura Utilizada

```text
Swagger UI
      |
HTTP JSON
      |
Controller
      |
Service
      |
Repository (JpaRepository)
      |
Oracle Database
(TDS_TB_BRINQUEDOS)
```

---

# Repositório GitHub

Link do projeto:

```text
COLOCAR_LINK_GITHUB_AQUI
```
