package br.com.java.exercicios04;

/* Faça um programa que leia um numero e caso ele seja positivo calcule e mostr:
 * - O numero digitado ao quadrado
 * - A raiz quadrada do numero digitado
 */

import java.util.Scanner;

public class E04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = Integer.parseInt(teclado.nextLine());
		
		if (num >= 0) {
			System.out.println("Número ao quadrado: " + (num * num));
			System.out.println("Raiz quadrada do numero: " + (Math.sqrt(num)));
		}else {
			System.out.println("O número digitado é invalido!");
		}
		
		teclado.close();
	}
}
