package br.com.java.exercicios04;

/* Escreva um programa que, dados dois numeros inteiros, mostre na tela o maior deles,
 * assim como a diferença existente entre ambos
 */

import java.util.Scanner;

public class E06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois numeros inteiros: ");
		int num1 = teclado.nextInt(), num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior número é " + num1 + " com uma diferença de " + (num1 - num2));
		}else {
			System.out.println("O maior número é " + num2 + " com uma diferença de " + (num2 - num1));
		}
		
		
		teclado.close();
	}
}
