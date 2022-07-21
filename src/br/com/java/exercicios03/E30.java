package br.com.java.exercicios03;

import java.util.Scanner;

public class E30 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor em real: ");
		float real = teclado.nextFloat(), dolar = 5.44f;
		
		dolar = real / dolar;
		
		System.out.println(real + " equivale a " + dolar + " dolares");
		
		teclado.close();
	}
}
