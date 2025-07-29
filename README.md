# Sistema de Pedidos em Java (POO)

Este projeto implementa um sistema básico de pedidos utilizando os pilares da Programação Orientada a Objetos (POO) em Java.

## Objetivo

Simular a criação de um pedido com múltiplos itens, aplicando os conceitos de encapsulamento, abstração e composição.

## Estrutura do Projeto

- **Produto**  
  Representa um produto com nome e preço.

- **ItemPedido**  
  Representa um item do pedido contendo um produto e sua quantidade.

- **Pedido**  
  Contém uma lista de itens e um método para calcular o valor total do pedido.

- **Main**  
  Classe principal que simula a criação de dois produtos, seus itens e exibe o resumo do pedido.

## Pilares de POO Aplicados

| Pilar           | Descrição                                                                 | Onde aparece                             |
|-----------------|---------------------------------------------------------------------------|------------------------------------------|
| Encapsulamento  | Atributos privados acessados via métodos públicos (`getters`)             | Todas as classes                         |
| Abstração       | Modelagem de entidades do mundo real com atributos e comportamentos       | Produto, ItemPedido, Pedido              |
| Composição      | Objetos que contêm outros objetos como atributos                          | Pedido contém ItemPedido; ItemPedido contém Produto |
| Herança         | Não utilizado neste projeto                                                | —                                        |

## Tecnologias

- Java 17+
- ArrayList (java.util)

## Como executar

1. Compile os arquivos `.java`:
   ```bash
   javac Main.java

