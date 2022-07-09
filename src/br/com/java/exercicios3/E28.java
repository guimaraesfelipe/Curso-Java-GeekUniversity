package br.com.java.exercicios3;

import java.util.Scanner;

public class E28 {

	public static void main(String[] args) {
		//Faça a leitura de tres valores e apresente como resultado a soma dos quadrados dos tres valores lidos
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int valor1 = teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = teclado.nextInt();
		
		System.out.println("Digite o terceiro valor: ");
		int valor3 = teclado.nextInt();
		
		int resultado = (valor1 * valor1) + (valor2 * valor2) + (valor3 * valor3);
		
		System.out.println("A soma do quadrado dos valores 1, 2 e 3 é: " + resultado);
		
		teclado.close();
	}
}
