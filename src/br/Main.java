package br;

public class Main {
  public static void main(String[] args) {

    Produto p1 = new Produto("Notebook", 2349.00);

    ItemPedido item1 = new ItemPedido(p1, 10);

    Pedido pedido = new Pedido();
    pedido.adicionarItem(item1);
    pedido.exibirResumo();




  }
}