# 📚 ForumHub API

API REST desenvolvida com Spring Boot para gerenciamento de tópicos de
fórum.

## 🚀 Tecnologias Utilizadas

-   Java 17+
-   Spring Boot
-   Spring Data JPA
-   Hibernate
-   Banco de dados relacional (H2 ou PostgreSQL)
-   Jakarta Validation
-   Swagger / OpenAPI

------------------------------------------------------------------------

## 🚀 Funcionalidades

✔ Criar tópico\
✔ Listar todos os tópicos\
✔ Buscar tópico por ID\
✔ Atualizar tópico\
✔ Deletar tópico\
✔ Validação de dados\
✔ Regra para evitar tópicos duplicados\
✔ Status HTTP corretos com ResponseEntity

------------------------------------------------------------------------

## 🧱 Estrutura do Projeto

br.com.forumhub\
├── controller\
├── service\
├── repository\
├── model\
├── dto

------------------------------------------------------------------------

## 📌 Endpoints

### 🔹 Criar Tópico

POST /topicos

``` json
{
  "titulo": "Dúvida sobre Spring",
  "mensagem": "Como funciona o @Transactional?",
  "autor": "Ronaldo",
  "curso": "Spring Boot"
}
```

Retorno: 201 Created

------------------------------------------------------------------------

### 🔹 Listar Tópicos

GET /topicos\
Retorno: 200 OK

------------------------------------------------------------------------

### 🔹 Buscar por ID

GET /topicos/{id}\
Retorno: 200 OK\
Se não existir: 404 Not Found

------------------------------------------------------------------------

### 🔹 Atualizar Tópico

PUT /topicos/{id}

``` json
{
  "titulo": "Título atualizado",
  "mensagem": "Nova mensagem",
  "curso": "Spring Avançado"
}
```

Retorno: 200 OK

------------------------------------------------------------------------

### 🔹 Deletar Tópico

DELETE /topicos/{id}\
Retorno: 204 No Content

------------------------------------------------------------------------

## ⚙️ Regras de Negócio

-   Não é permitido cadastrar tópicos com mesmo título e mensagem.
-   O autor é definido apenas na criação e não pode ser alterado.
-   Todos os campos obrigatórios são validados.

------------------------------------------------------------------------

## 🛠 Como Executar

1.  Clone o repositório git clone
    https://github.com/seu-usuario/forumhub.git

2.  Acesse a pasta do projeto cd forumhub

3.  Execute a aplicação mvn spring-boot:run

------------------------------------------------------------------------

## 📖 Documentação Swagger

Após iniciar a aplicação, acesse:

http://localhost:8080/swagger-ui.html

------------------------------------------------------------------------

## 👨‍💻 Autor

Desenvolvido por Ronaldo Vilela

------------------------------------------------------------------------

## 📄 Licença

Projeto para fins educacionais.
