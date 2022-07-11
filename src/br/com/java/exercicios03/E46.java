package br.com.java.exercicios03;

import java.util.Scanner;

public class E46 {
	public static void main(String[] args) {
		/*Faça um programa que leia um numero inteiro positivo de tres digitos (100 a 999).
		 * Gere outro numero formado pelos digitos invertidos do numero lido.
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero entre 100 e 999: ");
		int num = teclado.nextInt();
		
		if (num >= 100 && num <= 999) {
			for (int i = Integer.toString(num).length(); i > 0; i--) {
				String digito = Integer.toString(num).substring(i - 1, i);
				System.out.print(digito);
			}
		}else {
			System.err.println("O número digitado possui menos de 4 digitos.");
		}
		
		teclado.close();
	}
}
