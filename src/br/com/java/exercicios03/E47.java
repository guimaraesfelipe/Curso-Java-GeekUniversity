package br.com.java.exercicios03;

import java.util.Scanner;

public class E47 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro com 4 caracteres: ");
		String num = Integer.toString(teclado.nextInt());
		
		if (num.length() >= 4) {
			for (char digito : num.toCharArray()) {
				System.out.println(digito);
			}
		} else {
			System.err.println("O número digitado possui menos de 4 digitos.");
		}
		
		teclado.close();
	}
}
