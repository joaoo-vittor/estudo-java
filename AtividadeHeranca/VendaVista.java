public class VendaVista extends Venda {

	private int desconto;

  public void setDesconto(int desconto) {
    this.desconto = desconto;
  }

  @Override
	public double getTotal() {
		return super.getTotal() - this.desconto;
	}

}
