package br.com.java.exercicios03;

import java.util.Scanner;

public class E27 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a área em hectares: ");
		float hectares = teclado.nextFloat(), m2;
		
		m2 = hectares * 10000f;
		
		System.out.println(hectares + " hectares equivale a " + m2 + " metros quadrados");
		
		teclado.close();
	}
}
