package br.com.java.exercicios03;

import java.util.Scanner;

public class E26 {
	public static void main(String[] args) {
		//Leia um valor de area em metros quadrados e apresente-o convertido em hectares
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a área em metros quadrados: ");
		float m2 = teclado.nextFloat(), hectares;
		
		hectares = m2 * 0.0001f;
		
		System.out.println(m2 + " metros quadrados equivale a " + hectares + " hectares");
		
		teclado.close();
	}
}
