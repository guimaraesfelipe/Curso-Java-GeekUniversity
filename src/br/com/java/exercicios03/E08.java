package br.com.java.exercicios03;

import java.util.Scanner;

public class E08 {
	public static void main(String[] args) {
		//Leia uma temperatura em graus Kelvin e apresente-a convertida em graus Celsius
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura e graus Kelvin: ");
		float kelvin = teclado.nextFloat(), celsius;

		celsius = kelvin - 273.15f;
		
		System.out.println(kelvin + " graus kelvin equivale a " + celsius + " graus celsius");
		
		teclado.close();
	}
}
