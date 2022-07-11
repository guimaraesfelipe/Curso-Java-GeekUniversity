package br.com.java.exercicios03;

import java.util.Scanner;

/* Faça um programa que receba os valores A e B e calcule o valor da hipotenusa. Imprima o resultado dessa operação
 */

public class E35 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		double a = teclado.nextFloat();
		
		System.out.println("Digite o valor de B: ");
		double b = teclado.nextFloat();
		
		double h = Math.hypot(a, b);
		
		System.out.println("Hipotenusa: " + h);
		
		teclado.close();
	}
}
