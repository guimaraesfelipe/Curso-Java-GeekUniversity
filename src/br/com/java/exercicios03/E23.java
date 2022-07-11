package br.com.java.exercicios03;

import java.util.Scanner;

public class E23 {
	public static void main(String[] args) {
		//Leia um valor de comprimento em metros e apresente-o convertido em jardas
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o comprimento em metros: ");
		float metros = teclado.nextFloat(), jardas;
		
		jardas = metros / 0.91f;
		
		System.out.println(metros + " metros equivale a " + jardas + " jardas");
		
		teclado.close();
	}
}
