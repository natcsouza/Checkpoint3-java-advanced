# CHECKPOINT 3 - JAVA ADVANCED

## Integrantes

- Natalia Cristina de Souza - RM: 564099
- Nickolas Davi Silva Souza - RM: 564105
- Samara de Oliveira Vilela - RM: 566133
- Rodrigo Carvalho Silva - RM: 565162

---

# Sobre o Projeto

Projeto desenvolvido em Java utilizando Spring Boot para criação de uma API REST de gerenciamento de brinquedos para crianças até 14 anos.

A aplicação realiza operações de CRUD integradas ao banco Oracle Database, utilizando persistência com Spring Data JPA, Validation Beans, Swagger OpenAPI e testes via Swagger UI e Postman.

---

# Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Validation Beans
- Swagger OpenAPI
- Oracle Database
- Maven
- IntelliJ IDEA
- Oracle SQL Developer
- Swagger UI
- Postman
- Apache Tomcat (localhost:8080)

---

# Estrutura do Projeto

Arquitetura em camadas:

```text
controller
service
repository
model
resources
```

---

# Banco de Dados

Banco Oracle utilizado para persistência.

Tabela:

```sql
TDS_TB_BRINQUEDOS
```

Colunas:

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

Exemplo:

```properties
spring.datasource.url=
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Persistência realizada utilizando Spring Data JPA.

---

# Repository

Foi utilizado:

```java
JpaRepository<Brinquedo, Long>
```

Benefícios:

- Inserção
- Consulta
- Atualização
- Exclusão
- Persistência simplificada

---

# Validation Beans

Foram utilizadas validações automáticas:

```java
@NotBlank
@NotNull
@Positive
@Valid
```

Objetivos:

- Impedir campos vazios
- Impedir valores inválidos
- Garantir integridade dos dados

---

# Swagger OpenAPI

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

Acesso:

```http
http://localhost:8080/swagger-ui/index.html
```

---

# Arquitetura Utilizada

```text
Swagger UI / Postman
        ↓
HTTP JSON
        ↓
Controller
        ↓
Service
        ↓
Repository (JpaRepository)
        ↓
Oracle Database
(TDS_TB_BRINQUEDOS)
```

<img width="1692" height="929" alt="Diagrama de arquitetura" src="https://github.com/user-attachments/assets/40f99f40-020f-4041-bdb2-50a50eb8273d" />

---

# Operações CRUD

Endpoints:

```http
POST /brinquedos
GET /brinquedos
GET /brinquedos/{id}
PUT /brinquedos/{id}
DELETE /brinquedos/{id}
```

---

# Swagger UI

<img width="1920" height="1001" alt="Swagger funcionando" src="https://github.com/user-attachments/assets/05b1c2fc-c8a0-4405-bfda-b0a68f160f78" />

---

# CRUD - POST

JSON utilizado:

```json
{
"nome":"Carrinho Hot Wheels",
"tipo":"Carrinho",
"classificacao":"5 anos",
"tamanho":"Pequeno",
"preco":59.90
}
```

<img width="1920" height="992" alt="CRUD POST funcionando" src="https://github.com/user-attachments/assets/1c9d9e07-5132-4e67-9e26-6ac4dacf1586" />

<img width="1919" height="1043" alt="Postman - Método POST Create" src="https://github.com/user-attachments/assets/057c302b-79fb-4279-9bb7-da6d23694a03" />

---

# CRUD - GET GERAL

<img width="1918" height="998" alt="CRUD GET LIST funcionando" src="https://github.com/user-attachments/assets/5b050173-281e-47ac-8a38-8eef343eaf31" />
<img width="1920" height="1041" alt="Postman - Método GET LIST geral" src="https://github.com/user-attachments/assets/fdd2151b-e3d5-4bd1-a7fe-b545198f0ce1" />

---

# CRUD - GET POR ID

<img width="1917" height="995" alt="CRUD GET ID funcionando" src="https://github.com/user-attachments/assets/39c4fafd-568f-4f29-bf09-dbc13998769c" />
<img width="1920" height="1042" alt="Postman - Método GET ID" src="https://github.com/user-attachments/assets/df5bc3c8-badb-4516-be0e-496a2d22fc4c" />

---

# CRUD - PUT

JSON utilizado:

```json
{
"nome":"Carrinho Hot Wheels Deluxe",
"tipo":"Carrinho",
"classificacao":"6 anos",
"tamanho":"Grande",
"preco":79.90
}
```

<img width="1920" height="997" alt="CRUD PUT funcionando" src="https://github.com/user-attachments/assets/e38aaebb-0d52-487e-af9e-5679c512b556" />
<img width="1920" height="1043" alt="Postman - Método PUT Update" src="https://github.com/user-attachments/assets/4900cc8e-2960-46fe-a58e-be5acdfa1434" />

---

# CRUD - DELETE

<img width="1920" height="996" alt="CRUD DELETE funcionando" src="https://github.com/user-attachments/assets/cc1a0d24-44ff-42b3-958f-f8b071686c23" />
<img width="1920" height="1041" alt="Postman - Método DELETE" src="https://github.com/user-attachments/assets/003f4ce8-457b-476a-827b-06c8e5621b1d" />

---

# Evidência Exclusão

<img width="1920" height="997" alt="CRUD GET ID após DELETE" src="https://github.com/user-attachments/assets/9a67ff5b-0f20-46d4-b87e-17c840dd8629" />
<img width="1920" height="1040" alt="Postman - Método GET ID depois do DELETE" src="https://github.com/user-attachments/assets/d845bff9-1861-44e6-b53c-7771fbf79b3b" />

---

# Oracle SQL Developer

Comando:

```sql
DESC TDS_TB_BRINQUEDOS;
```

<img width="1918" height="1038" alt="Estrutura da tabela DESC - ORACLE SQL DEVELOPER" src="https://github.com/user-attachments/assets/7e20fd99-6b91-447b-90f3-17aec8b00def" />

---

Comando:

```sql
SELECT * FROM TDS_TB_BRINQUEDOS;
```

<img width="1916" height="1040" alt="Dados persistidos no banco SELECT - ORACLE SQL DEVELOPER" src="https://github.com/user-attachments/assets/042ee94f-550e-4e0f-9f85-bb3b46622e90" />

---

# IntelliJ IDEA

Aplicação executando:

<img width="1920" height="1045" alt="Aplicação rodando no terminal IntelliJ 1" src="https://github.com/user-attachments/assets/767a1086-af9a-4146-a1b6-cda7a30d8d21" />
<img width="1920" height="1044" alt="Aplicação rodando no terminal IntelliJ 2" src="https://github.com/user-attachments/assets/0b7230fc-7ed1-495e-b9c0-62f8036c0987" />
<img width="1920" height="1043" alt="Aplicação rodando no terminal IntelliJ 3" src="https://github.com/user-attachments/assets/cfd79a57-6573-4cfd-adb8-6fb69385d9a7" />

---

# Spring Initializr

<img width="1917" height="997" alt="Spring Initializr" src="https://github.com/user-attachments/assets/92859d47-1d9f-440a-a171-c24f10e78c3a" />

---

# Repositório GitHub

```text
https://github.com/natcsouza/Checkpoint3-java-advanced
```
