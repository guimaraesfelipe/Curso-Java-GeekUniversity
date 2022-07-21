package br.com.java.exercicios04;

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		float nota1 = teclado.nextFloat();
		
		if (nota1 < 0 || nota1 > 10)  {
			System.out.println("Nota 1 invalida!");
			System.exit(0);
		}
		
		System.out.println("Digite a nota 2: ");
		float nota2 = teclado.nextFloat();
		
		if (nota2 < 0 || nota2 > 10)  {
			System.out.println("Nota 2 invalida!");
			System.exit(0);
		}
		
		System.out.println("O valor da média é " + (nota1 + nota2) / 2);
		
		
		teclado.close();

	}

}
