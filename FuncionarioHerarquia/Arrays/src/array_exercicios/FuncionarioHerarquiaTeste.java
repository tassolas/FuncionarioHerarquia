package array_exercicios;

public class FuncionarioHerarquiaTeste {

	public static void main(String[] args) {
		Gerente g1 = new Gerente("Tassio", "101", 1200);
		Vendedor v2 = new Vendedor("Henrique", "103", 1500);
		Assistente a3 = new Assistente("João", "105", 1800);
		
		double soma;
		soma = g1.getSalarioBase() + v2.getSalarioBase() + a3.getSalarioBase();
		System.out.println("A soma dos salários é " + soma);
	}
}
