package br.com.java.exercicios03;

import java.util.Scanner;

public class E23 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o comprimento em metros: ");
		float metros = teclado.nextFloat(), jardas;
		
		jardas = metros / 0.91f;
		
		System.out.println(metros + " metros equivale a " + jardas + " jardas");
		
		teclado.close();
	}
}
