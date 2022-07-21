package br.com.java.exercicios03;

import java.util.Scanner;

public class E22 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o comprimento em jardas: ");
		float jardas = teclado.nextFloat(), metros;
		
		metros = 0.91f * jardas;
		
		System.out.println(jardas + " jardas equivale a " + metros + " metros");
		
		teclado.close();
	}
}
