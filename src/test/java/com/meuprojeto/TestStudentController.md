# Testes do Projeto de Cadastro de Alunos

Este documento descreve os casos de teste para o projeto de cadastro de alunos.

## Casos de Teste

1. **testShowSignUpForm**: Este caso de teste verifica se o método `showSignUpForm` retorna a view correta ("add-student").

2. **testAddStudent**: Este caso de teste verifica se o método `addStudent` retorna a view correta ("redirect:list") quando não há erros no formulário de adição de aluno.

3. **testUpdateStudent**: Este caso de teste verifica se o método `updateStudent` retorna a view correta ("index") quando não há erros no formulário de atualização de aluno.

4. **testDeleteStudent**: Este caso de teste verifica se o método `deleteStudent` retorna a view correta ("index") após a exclusão de um aluno.

## Executando os Testes

Para executar os testes, você pode usar o comando `mvn test` no terminal.

## Contribuição

Contribuições são bem-vindas! Por favor, le