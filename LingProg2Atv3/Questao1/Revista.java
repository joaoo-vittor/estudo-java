public class Revista {

  private String nome;
  private String autor;
  private double valor;

  public Revista(String nome) {
    this.nome = nome;
    this.autor = "";
    this.valor = 0.0D;
  }

  public Revista(String nome, double valor, String autor) {
    this.nome = nome;
    this.autor = autor;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Revista other = (Revista) obj;
    if (autor == null) {
      if (other.autor != null)
        return false;
    } else if (!autor.equals(other.autor))
      return false;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
      return false;
    return true;
  }

}
