package br.com.java.exercicios03;

import java.util.Scanner;

public class E42 {
	public static void main(String[] args) {
		/*Receba o sal�rio-base de um funcion�rio.
		 * Calcule e imprima o sal�rio a receber, sabendo-se que esse funcion�rio tem uma gratifica��o de 5% sobre o sal�rio-base.
		 * Al�m disso, ele paga 7% de imposto sobre o sal�rio-base
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio-base do funcion�rio: ");
		float salario = teclado.nextFloat();
		salario = salario + (salario * 5) / 100;
		
		System.out.println("O sal�rio liquido a receber pelo funcion�rio � " + (salario - (salario * 7) / 100));
		
		teclado.close();
	}
}
