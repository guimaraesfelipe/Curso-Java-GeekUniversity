package br.com.java.exercicios04;

import java.util.Scanner;

/* Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e imprima o m�s correspondente a este numero.
 * 
 * 
 */

public class E16 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o n�mero do m�s: ");
		int num = teclado.nextInt();
		
		if (num > 0 && num <= 12) {
			switch (num) {
				case 1: {
					System.out.println("Janeiro");
					break;
				}
				case 2: {
					System.out.println("Fevereiro");
					break;
				}
				case 3: {
					System.out.println("Mar�o");
					break;
				}
				case 4: {
					System.out.println("Abril");
					break;
				}
				case 5: {
					System.out.println("Maio");
					break;
				}
				case 6: {
					System.out.println("Junho");
					break;
				}
				case 7: {
					System.out.println("Julho");
					break;
				}
				case 8: {
					System.out.println("Agosto");
					break;
				}
				case 9: {
					System.out.println("Setembro");
					break;
				}
				case 10: {
					System.out.println("Outubro");
					break;
				}
				case 11: {
					System.out.println("Novembro");
					break;
				}
				case 12: {
					System.out.println("Dezembro");
					break;
				}
			}
		}else {
			System.out.println("N�mero invalido!");
		}
		
		
		teclado.close();
	}
}