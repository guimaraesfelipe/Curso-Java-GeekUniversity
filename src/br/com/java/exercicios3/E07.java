package br.com.java.exercicios3;

import java.util.Scanner;

public class E07 {
	public static void main(String[] args) {
		//Leia uma temperatura em graus fahrenheit e apresente-a convertida em graus Celsius
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus fahrenheit: ");
		float fahrenheit = teclado.nextFloat(), celsius;

		celsius = 5.0f * (fahrenheit - 32.0f) / 9.0f;
		
		System.out.println(fahrenheit + " graus fahrenheit equivale a " + celsius + " graus celsius");
		
		teclado.close();
	}
}
