package br.com.java.exercicios3;

import java.util.Scanner;

public class E03 {
	public static void main(String[] args) {
		//Pe�a para o usuario digitar tr�s valores inteiros e imprima a soma deles
		int num1, num2, num3;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		num2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		num3 = teclado.nextInt();
		
		int resultado = num1 + num2 + num3;
		System.out.println("A soma dos n�meros � igual a " + resultado);
		
		teclado.close();
	}
}
