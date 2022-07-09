package br.com.java.exercicios3;

import java.util.Scanner;

public class E24 {
	public static void main(String[] args) {
		//Leia um valor de area em metros quadrados e apresente-o convertido em acres
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a área em metros quadrados: ");
		float m2 = teclado.nextFloat(), acres;
		
		acres = m2 * 0.000247f;
		
		System.out.println(m2 + " metros quadrados equivale a " + acres + " acres");
		
		teclado.close();
	}
}
