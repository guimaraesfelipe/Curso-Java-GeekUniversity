package br.com.java.exercicios04;

/* Faça um programa que receba dois numeros e mostre qual é o maior
 * 
 */

import java.util.Scanner;

public class E01 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("Digite o segundo número: ");
		int num2 = Integer.parseInt(teclado.nextLine());
		
		if (num1 > num2) {
			System.out.println("O maior numero é: " + num1);
		}else {
			System.out.println("O maior numero é: " + num2);
		}
		
		teclado.close();
	}

}
