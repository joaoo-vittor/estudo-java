public class Produto {

  private String nome;
  private String descricao;
  private double preco;
  private int qtdProduto;

  public Produto() {}

  public Produto(String nome, String descricao, double preco) {
    this.nome = nome;
    this.descricao = descricao;
    this.preco = Math.abs(preco);
  }

  public void infoProduto() {
    System.out.printf("Nome do Produto: %s \n", this.nome);
    System.out.printf("Descrição: %s \n", this.descricao);
    System.out.printf("Preço:  R$ %.2f \n", this.preco);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = Math.abs(preco);
  }

  public int getQtdProduto() {
    return qtdProduto;
  }

  public void setQtdProduto(int qtdProduto) {
    this.qtdProduto = Math.abs(qtdProduto);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Produto other = (Produto) obj;
    if (descricao == null) {
      if (other.descricao != null)
        return false;
    } else if (!descricao.equals(other.descricao))
      return false;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
      return false;
    if (qtdProduto != other.qtdProduto)
      return false;
    return true;
  }



}
