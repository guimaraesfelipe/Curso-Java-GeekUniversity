package br.com.java.exercicios03;

public class E39 {
	public static void main(String[] args) {
		float total = 780000.00f, ganhador1, ganhador2, ganhador3;
		
		ganhador1 = (total * 46) / 100;
		ganhador2 = (total * 32) / 100;
		ganhador3 = total - (ganhador1 + ganhador2);
		
		System.out.println("O ganhador 1 receberá: " + ganhador1);
		System.out.println("O ganhador 2 receberá: " + ganhador2);
		System.out.println("O ganhador 3 receberá: " + ganhador3);
	}
}
