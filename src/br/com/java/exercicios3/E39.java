package br.com.java.exercicios3;

public class E39 {
	public static void main(String[] args) {
		/*A importância de R$780.000,00 será dividida entre três ganhadores de um concurso. Sendo que da quantia total:
		* O primeiro ganhador receberá 46%
		* O segundo ganhador receberá 32%
		* O terceiro ganhador receberá o restante
		* Calcule e imprima a quantia ganha por cada um dos ganhadores
		*/
		
		float total = 780000.00f, ganhador1, ganhador2, ganhador3;
		
		ganhador1 = (total * 46) / 100;
		ganhador2 = (total * 32) / 100;
		ganhador3 = total - (ganhador1 + ganhador2);
		
		System.out.println("O ganhador 1 receberá: " + ganhador1);
		System.out.println("O ganhador 2 receberá: " + ganhador2);
		System.out.println("O ganhador 3 receberá: " + ganhador3);
	}
}
