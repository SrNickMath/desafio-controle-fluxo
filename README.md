# Projeto Contador

## Descrição
Este projeto é uma aplicação Java que recebe dois números inteiros como entrada e imprime uma contagem de números a partir do resultado da subtração desses números. Caso o primeiro número seja maior ou igual ao segundo, o sistema lança uma exceção personalizada chamada `ParametrosInvalidosException`.

## Requisitos
- Java 11+

## Exemplo de Uso
Quando o programa é executado, o usuário deve fornecer dois números inteiros. Se o segundo número for maior que o primeiro, o programa imprimirá uma lista de números entre 1 e o resultado da subtração dos dois números.

## Estrutura do Código
- **Contador.java:** Implementa a lógica principal do programa, realizando a subtração e imprimindo a contagem.
- **ParametrosInvalidosException.java:** Exceção personalizada lançada quando o segundo parâmetro é menor ou igual ao primeiro.

## Licença
Este projeto está licenciado sob a MIT License.
