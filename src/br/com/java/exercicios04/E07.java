package br.com.java.exercicios04;

import java.util.Scanner;

public class E07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite dois numeros: ");
		int num1 = teclado.nextInt(), num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("O maior n�mero � " + num1);
		} else if (num1 < num2) {
			System.out.println("O maior n�mero � " + num2);
		}else {
			System.out.println("Os n�meros s�o iguais!");
		}
		
		teclado.close();
	}
}
