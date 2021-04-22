public class Carta {

  private String nome;
  private String naipe;

  public Carta(String nome, String naipe) {
    this.nome = nome;
    this.naipe = naipe;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNaipe() {
    return naipe;
  }
  public void setNaipe(String naipe) {
    this.naipe = naipe;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Carta other = (Carta) obj;
    if (naipe == null) {
      if (other.naipe != null)
        return false;
    } else if (!naipe.equals(other.naipe))
      return false;
    if (nome == null) {
      if (other.nome != null)
        return false;
    } else if (!nome.equals(other.nome))
      return false;
    return true;
  }

}
