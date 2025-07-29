package br;

//ATRIBUTOS
public class Produto {
  private String nome;
  private double preco;

//METODOS PUBLICOS


//GETTERS SETTERS
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  //CONSTRUTOT
  public Produto(String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
  }
}
