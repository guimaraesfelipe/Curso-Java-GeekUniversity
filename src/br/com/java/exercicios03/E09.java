package br.com.java.exercicios03;

import java.util.Scanner;

public class E09 {
	public static void main(String[] args) {
		//Leia uma temperatura em graus Celsius e apresente-a convertida em graus Kelvin
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus celsius: ");
		float celsius = teclado.nextFloat(), kelvin;

		kelvin = celsius + 273.15f;
		
		System.out.println(celsius + " graus celsius equivale a " + kelvin + " graus kelvin");
		
		teclado.close();
	}
}
