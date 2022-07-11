package br.com.java.exercicios04;

import java.util.Scanner;

/* Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia da semana correspondente a este numero.
 * Isto é, domingo se 1, segunda se 2 e etc.
 */

public class E15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número da semana: ");
		int num = teclado.nextInt();
		
		if (num > 0 && num <= 7) {
			switch (num) {
				case 1: {
					System.out.println("Domingo");
					break;
				}
				case 2: {
					System.out.println("Segunda-feira");
					break;
				}
				case 3: {
					System.out.println("Terça-feira");
					break;
				}
				case 4: {
					System.out.println("Quarta-feira");
					break;
				}
				case 5: {
					System.out.println("Quinta-feira");
					break;
				}
				case 6: {
					System.out.println("Sexta-feira");
					break;
				}
				case 7: {
					System.out.println("Sabado");
					break;
				}
			}
		}else {
			System.out.println("Número invalido!");
		}
		
		
		teclado.close();
	}
}
