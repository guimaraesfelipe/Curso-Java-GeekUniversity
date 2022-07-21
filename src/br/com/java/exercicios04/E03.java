package br.com.java.exercicios04;

import java.util.Scanner;

public class E03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		float num = teclado.nextFloat();
		
		if (num >= 0) {
			System.out.println(Math.sqrt(num));
		}else {
			System.out.println(num * num);
		}
		
		
		teclado.close();
	}
}
