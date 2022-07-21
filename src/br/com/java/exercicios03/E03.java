package br.com.java.exercicios03;

import java.util.Scanner;

public class E03 {
	public static void main(String[] args) {
		int num1, num2, num3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		num3 = teclado.nextInt();
		
		int resultado = num1 + num2 + num3;
		System.out.println("A soma dos números é igual a " + resultado);
		
		teclado.close();
	}
}
