public class Caixa {

	public static void main(String args[]) {

		Produto produto1 = new Produto(10.0, "Feijão");
		Produto produto2 = new Produto(20.0, "Arroz");
		Produto produto3 = new Produto(5.0, "Macarron");

    Venda v1 = new Venda();
    v1.adicioneProduto(produto1);
    v1.adicioneProduto(produto2);
    v1.adicioneProduto(produto3);

    System.out.println(v1.toString());
    System.out.println("---------------------------\n");


    VendaPrazo vp = new VendaPrazo();
    VendaVista vv = new VendaVista();

    vp.adicioneProduto(produto1);
    vp.adicioneProduto(produto2);
    vp.adicioneProduto(produto3);

    vp.setJuros(10);
    System.out.println(vp.toString());
    System.out.println(vp.getTotal());
    System.out.println("---------------------------\n");

    vv.adicioneProduto(produto1);
    vv.adicioneProduto(produto2);
    vv.adicioneProduto(produto3);

    vv.setDesconto(10);
    System.out.println(vv.toString());
    System.out.println(vv.getTotal());


	}
}
