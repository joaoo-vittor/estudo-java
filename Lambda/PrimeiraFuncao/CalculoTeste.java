<<<<<<< HEAD
package Lambda.PrimeiraFuncao;
=======
package PrimeiraFuncao;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class CalculoTeste {
	public static void main(String[] args) {

		Calculo calculo = new Soma();
		System.out.println(calculo.execultar(2, 2));

		calculo = new Multiplicar();
		System.out.println(calculo.execultar(2, 3));

	}
}
