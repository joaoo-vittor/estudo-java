package Lambda.PrimeiraFuncao;

public class CalculoTeste {
	public static void main(String[] args) {

		Calculo calculo = new Soma();
		System.out.println(calculo.execultar(2, 2));

		calculo = new Multiplicar();
		System.out.println(calculo.execultar(2, 3));

	}
}
