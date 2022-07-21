package br.com.java.exercicios04;

import java.util.Scanner;

public class E05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = Integer.parseInt(teclado.nextLine());
		
		if (num % 2 == 0) {
			System.out.println("É par!");
		}else {
			System.out.println("É impar!");
		}
		
		teclado.close();
	}
}
