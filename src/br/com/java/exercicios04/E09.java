package br.com.java.exercicios04;

import java.util.Scanner;

/* Leia o sal�rio de um trabalhador e o valor da presta��o de um empr�stimo.
 * Se a presta��o for maior que 20% do salario imprima: Empr�stimo n�o concedido.
 * Caso contr�rio imprima: Empr�stimo concedido.
 */

public class E09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio: ");
		float salario = teclado.nextFloat();
		
		System.out.println("Digite o valor da presta��o: ");
		float prestacao = teclado.nextFloat();
		
		if (prestacao > ((salario * 20) / 100)){
			System.err.println("Empr�stimo n�o concedido!");
		}else {
			System.out.println("Empr�stimo concedido!");
		}
		
		teclado.close();
	}
}
