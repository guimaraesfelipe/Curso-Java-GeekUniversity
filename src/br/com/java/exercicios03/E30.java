package br.com.java.exercicios03;

import java.util.Scanner;

public class E30 {
	public static void main(String[] args) {
		//Leia um valor em real e a cotação do dolar. Em seguida imprima o valor correspondente em dolares
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor em real: ");
		float real = teclado.nextFloat(), dolar = 5.44f;
		
		dolar = real / dolar;
		
		System.out.println(real + " equivale a " + dolar + " dolares");
		
		teclado.close();
	}
}
