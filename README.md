# 🚀 Forum Hub API

API REST desenvolvida com Spring Boot para gerenciamento de tópicos de
fórum.

Projeto criado como desafio prático da Alura, aplicando boas práticas de
desenvolvimento backend e arquitetura REST.

------------------------------------------------------------------------

## 📌 Sobre o Projeto

O Forum Hub é uma API que permite:

-   Criar tópicos
-   Listar tópicos
-   Buscar por ID
-   Atualizar informações
-   Deletar tópicos
-   Validar dados de entrada
-   Impedir cadastro de tópicos duplicados

A aplicação segue o padrão de arquitetura em camadas:

Controller → Service → Repository → Model → DTO

------------------------------------------------------------------------

## 🛠️ Tecnologias Utilizadas

-   Java 17
-   Spring Boot
-   Spring Data JPA
-   Hibernate
-   Jakarta Validation
-   Swagger / OpenAPI
-   Banco de dados relacional (H2 ou PostgreSQL)
-   Maven

------------------------------------------------------------------------

## 🧠 Conceitos Aplicados

-   Arquitetura em camadas
-   DTO para entrada e saída de dados
-   Uso de ResponseEntity para controle de status HTTP
-   Tratamento de exceções
-   Validação com Bean Validation
-   Princípios REST
-   Transações com @Transactional

------------------------------------------------------------------------

## 📡 Endpoints da API

### 🔹 Criar Tópico

POST `/topicos`

Status: `201 Created`

``` json
{
  "titulo": "Dúvida sobre Spring",
  "mensagem": "Como funciona o @Transactional?",
  "autor": "Ronaldo",
  "curso": "Spring Boot"
}
```

------------------------------------------------------------------------

### 🔹 Listar Todos

GET `/topicos`

Status: `200 OK`

------------------------------------------------------------------------

### 🔹 Buscar por ID

GET `/topicos/{id}`

Status: `200 OK`\
Se não encontrado: `404 Not Found`

------------------------------------------------------------------------

### 🔹 Atualizar Tópico

PUT `/topicos/{id}`

Status: `200 OK`

``` json
{
  "titulo": "Título atualizado",
  "mensagem": "Nova mensagem",
  "curso": "Spring Avançado"
}
```

------------------------------------------------------------------------

### 🔹 Deletar Tópico

DELETE `/topicos/{id}`

Status: `204 No Content`

------------------------------------------------------------------------

## ⚙️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

``` bash
git clone https://github.com/Ronaldo-Vilela/forum-hub-alura.git
```

### 2️⃣ Entrar na pasta

``` bash
cd forum-hub-alura
```

### 3️⃣ Executar a aplicação

``` bash
mvn spring-boot:run
```

------------------------------------------------------------------------

## 📖 Documentação da API

Após iniciar a aplicação, acesse:

http://localhost:8080/swagger-ui.html

------------------------------------------------------------------------

## 🧪 Validações Implementadas

-   Campos obrigatórios com @NotBlank
-   Bloqueio de tópicos duplicados (mesmo título e mensagem)
-   Tratamento de exceção para recurso não encontrado

------------------------------------------------------------------------

## 📂 Estrutura do Projeto

br.com.forumhub\
├── controller\
├── service\
├── repository\
├── model\
├── dto

------------------------------------------------------------------------

## 👨‍💻 Autor

Ronaldo Vilela\
Desenvolvedor Backend em evolução 🚀

GitHub: https://github.com/Ronaldo-Vilela

------------------------------------------------------------------------

## 📄 Licença

Projeto desenvolvido para fins educacionais.
