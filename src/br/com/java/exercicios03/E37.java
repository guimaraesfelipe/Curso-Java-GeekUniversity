package br.com.java.exercicios03;

import java.util.Scanner;

public class E37 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		float valor = teclado.nextFloat(), desconto = 12;
		
		System.out.println("O valor do produto com desconto é: " + (valor - (valor * desconto) / 100));
		
		teclado.close();
	}
}
