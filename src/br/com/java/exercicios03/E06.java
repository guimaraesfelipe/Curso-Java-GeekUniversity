package br.com.java.exercicios03;

import java.util.Scanner;

public class E06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da temperatura em graus celsius: ");
		float celsius = teclado.nextFloat(), fahrenheit;

		fahrenheit = celsius * 1.8f + 32;
		
		System.out.println(celsius + " graus celsius equivale a " + fahrenheit + " graus fahrenheit");
		
		teclado.close();
	}
}
