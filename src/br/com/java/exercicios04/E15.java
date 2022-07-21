package br.com.java.exercicios04;

import java.util.Scanner;

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
