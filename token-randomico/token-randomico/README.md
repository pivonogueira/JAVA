# Token-Randomico

## Ferramentas

[IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/#section=windows) - IDE para desenvolvimento

SpringBoot 3.0

## Endpoints:

### /api/usuario
#### POST:
Descrição: Cria um usuário

Request:

    {
    "nome": "Peter Parker",
    "cpf": "123456789",
    "dataNascimento": "1990-01-01",
    "email": "a@a.com",
    "senha": "123456",
    "administrador": true
    }

#### GET:
Descrição: Recupera uma lista de usuários

Request: Sem corpo.

### /api/usuario/{id}
#### DELETE
Descrição: Exclui o usuário enviado no ID

Request: Sem corpo.

#### PUT:
Descrição: Atualiza um usuário

Request:

    {
    "nome": "Mary Jane",
    "cpf": "123456789",
    "dataNascimento": "1995-01-21",
    "email": "a@a.com",
    "senha": "123456",
    "administrador": true
    }

#### GET:
Descrição: Recupera o usuário enviado no ID

Request: Sem corpo.

### /api/usuario/{id}/recuperar
#### Post
Descrição: Recupera a senha de um usuário

Request:

    {
    "cpf": "123456789",
    "chave": "612547",
    "novaSenha": "123123"
    }

### /api/token/{id}
#### PUT
Descrição: Reseta as chaves do usuário enviado no ID. Funcionalidade apenas para usuario administrador.

Request:
Dados de login do usuário Administrador.

    {
    "cpf": "123456789",
    "senha": "123456"
    }