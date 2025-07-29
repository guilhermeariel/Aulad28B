package br;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private List<ItemPedido> itens;

  //METODOS PUBLICOs
  public Pedido() {
    this.itens = new ArrayList<>();
  }
  public void adicionarItem(ItemPedido item) {
    this.itens.add(item);
  }

  public double calcularTotal() {
    double total = 0.0;
    for (ItemPedido item : itens) {
      total += item.getSubtotal();
    }
    return total;
  }
  public void exibirResumo(){
    System.out.println("Resumo do pedido");
    for (ItemPedido item : itens) {
      System.out.printf("%s - %d x R$ %.2f = R$ %.2f\n",
          item.getProduto().getNome(),
          item.getQuantidade(),
          item.getProduto().getPreco(),
          item.getSubtotal());
    }
    System.out.printf("Total do pedido: R$ %.2f\n", calcularTotal());
  }

  //GETTERS SETTERS
  public List<ItemPedido> getItens() {
    return itens;
  }

  public void setItens(List<ItemPedido> itens) {
    this.itens = itens;
  }
}
