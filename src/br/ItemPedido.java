package br;


public class ItemPedido {
  //ATRIBUTOS
  private Produto produto;
  private int quantidade;

  //GETTERS SETTERS
  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getSubtotal() {
    return produto.getPreco() * quantidade;
  }

  //CONTRUTOR
  public ItemPedido(Produto produto, int quantidade) {
    this.produto = produto;
    this.quantidade = quantidade;
  }
}
