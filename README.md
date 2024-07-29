# ContaBanco - DIO - Trilha Java Básico

## Descrição

Este projeto faz parte do curso de Java Básico da DIO. O desafio consiste em criar um programa que simule a criação de uma conta bancária, recebendo os dados do usuário via terminal e exibindo uma mensagem com as informações inseridas.

## Autores

- Wallace Tadeu da Silva ([GitHub](https://github.com/Wallacet28))
- Sintaxe - Desafio

## Objetivo

Exercitar todo o conteúdo apresentado no módulo de Sintaxe, codificando o seguinte cenário:

## Desafio

Crie o projeto `ContaBanco` que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:

### Atributos da Conta

| Atributo      | Tipo    | Exemplo        |
| ------------- | ------- | -------------- |
| Numero        | Inteiro | 1021           |
| Agencia       | Texto   | 067-8          |
| Nome Cliente  | Texto   | MARIO ANDRADE  |
| Saldo         | Decimal | 237.48         |

### Passos para Implementação

1. **Criação do Projeto**: 
    - Crie um novo projeto Java chamado `ContaBanco`.
    - Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do programa.

2. **Declaração de Variáveis**:
    - Revise as regras de declaração de variáveis para definir os atributos da conta.

3. **Entrada de Dados via Terminal**:
    - Utilize a classe `Scanner` para permitir que os dados sejam inseridos via terminal.
    - Mostre ao usuário mensagens indicando quais informações devem ser inseridas. Por exemplo:
      ```
      Programa: "Por favor, digite o número da Agência!"
      Usuário: 1021 (pressione ENTER para o próximo campo)
      ```

4. **Concatenação de Strings**:
    - Revise o método `concat` da classe `String` para concatenar as mensagens a serem exibidas.

5. **Exibição da Mensagem Final**:
    - Após todas as informações terem sido inseridas, exiba a seguinte mensagem:
      ```
      "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".
      ```
    - Os campos entre `[` e `]` devem ser substituídos pelas informações inseridas pelo usuário.

## Considerações Especiais

- Foi ajustada a configuração do `Scanner` para aceitar a vírgula como separador decimal, uma vez que este é o formato utilizado no Brasil.

## Exemplo de Uso

Ao executar o programa, o usuário será solicitado a inserir as informações da conta:

