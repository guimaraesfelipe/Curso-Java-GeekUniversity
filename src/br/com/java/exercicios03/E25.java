package br.com.java.exercicios03;

import java.util.Scanner;

public class E25 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a área em acres: ");
		float acres = teclado.nextFloat(), m2;
		
		m2 = acres * 4048.58f;
		
		System.out.println(acres + " acres equivale a " + m2 + " metros quadrados");
		
		teclado.close();
	}
}
