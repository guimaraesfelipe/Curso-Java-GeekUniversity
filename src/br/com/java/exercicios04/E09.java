package br.com.java.exercicios04;

import java.util.Scanner;

public class E09 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o salário: ");
		float salario = teclado.nextFloat();
		
		System.out.println("Digite o valor da prestação: ");
		float prestacao = teclado.nextFloat();
		
		if (prestacao > ((salario * 20) / 100)){
			System.err.println("Empréstimo não concedido!");
		}else {
			System.out.println("Empréstimo concedido!");
		}
		
		teclado.close();
	}
}
