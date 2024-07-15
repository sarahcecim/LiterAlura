# **Alura Latam & ONE - Oracle Next Education**
# Challenge: LiterAlura 📖

## Descrição

Neste emocionante desafio de programação, consistiu em construir um catálogo próprio de livros: LiterAlura. Foram realizadas solicitações a uma API de livros, manipulação de dados JSON, armazenamento em um banco de dados e, finalmente, filtragem e exibição dos livros e autores de interesse.

## Objetivo

Desenvolver um catálogo de livros que ofereça interação textual (via console) com os usuários, proporcionando pelo menos 5 opções de interação.

## Características do Projeto

- **Interação com o Usuário:** Menu interativo com pelo menos 5 opções.
- **Consumo de API:** Uso da API Gutendex para buscar livros.
- **Manipulação de Dados:** Análise da resposta JSON usando a biblioteca Jackson.
- **Base de Dados:** Inserção e consulta de dados usando Spring Data JPA e PostgreSQL.
- **Exibição de Resultados:** Filtragem e apresentação de dados no console.

## Requísitos do projeto para seu desenvolvimento

### Programas e Versões

-   **Java JDK:** 17
-   **Maven:** 4
-   **Spring Boot:** 3.2.3
-   **PostgreSQL:** 16
-   **IDE:** IntelliJ IDEA

### Configuração do projeto

-   **Spring Initializr:**
    -   Java 17
    -   Maven
    -   Spring Boot 3.2.3
    -   Proyecto en JAR

### Dependências

-   **Spring Data JPA**
-   **Postgres Driver**
-   **Jackson (versão 2.16)**

## Passos para completar o desafio

1.  **Configuração do Ambiente Java**
2.  **Criação do Projeto**
3.  **Consumo da API**
4.  **Análise da Resposta JSON**
5.  **Inserção e Consulta no Banco de Dados**
6.  **Exibição de Resultados para os Usuários**

## Uso da API Gutendex

A API Gutendex é um catálogo de informações de mais de 70,000 livros do Project Gutenberg. Não é necessário chave de acesso para realizar consultas.

### Clases e Métodos Chave

-   **HttpClient:** Para realizar solicitações à API.
-   **HttpRequest:** Para configurar e personalizar solicitações.
-   **HttpResponse:** Para gerenciar respostas recebidas da API.
-   **Jackson:** Para o mapeamento de dados JSON para objetos Java.

### Funcionalidades do projeto

1.  **Busca de livros por título**
2.  **Listagem de todos os livros**
3.  **Lista de autores**
4.  **Listar autores vivos em um determinado ano**
5.  **Estatísticas de quantidade de livros por idioma**


## Exemplo de Consulta

Foi realizada a consulta de um livro por título na API Gutendex usando a URL base https://gutendex.com/books/.

-   Título
-   Autor
-   Idiomas
-   Número de Downloads

Os autores terão:

-   Nome
-   Ano de nascimento
-   Ano de falecimento
----
***Contato***

Sarah Cecim P. de Souza - Desenvolvedora do projeto

*contato: sarahhcecim@gmail.com*
