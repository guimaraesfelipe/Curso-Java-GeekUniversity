package br.com.java.exercicios04;

import java.util.Scanner;

public class E11 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = teclado.nextInt();
		int soma = 0;
		
		if (num > 0) {
			for (int i = Integer.toString(num).length(); i > 0; i--) {
				String caract = Integer.toString(num).substring(i - 1, i);
				soma += (Integer.parseInt(caract));	
			}
			System.out.println("A soma dos caracteres é " + soma);
		}else {
			System.out.println("Número invalido!");
		}
		
		teclado.close();
	}

}
