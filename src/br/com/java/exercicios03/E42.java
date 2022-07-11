package br.com.java.exercicios03;

import java.util.Scanner;

public class E42 {
	public static void main(String[] args) {
		/*Receba o salário-base de um funcionário.
		 * Calcule e imprima o salário a receber, sabendo-se que esse funcionário tem uma gratificação de 5% sobre o salário-base.
		 * Além disso, ele paga 7% de imposto sobre o salário-base
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o salário-base do funcionário: ");
		float salario = teclado.nextFloat();
		salario = salario + (salario * 5) / 100;
		
		System.out.println("O salário liquido a receber pelo funcionário é " + (salario - (salario * 7) / 100));
		
		teclado.close();
	}
}
