package br.com.java.exercicios04;

/* Faça um programa que receba dois numeros e mostre o maior.
 * Se por acaso os dois numeros forem iguais, imprima a mensagem numeros iguais.
 */

import java.util.Scanner;

public class E07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int num1 = teclado.nextInt(), num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior número é " + num1);
		} else if (num1 < num2) {
			System.out.println("O maior número é " + num2);
		}else {
			System.out.println("Os números são iguais!");
		}
		
		teclado.close();
	}
}
