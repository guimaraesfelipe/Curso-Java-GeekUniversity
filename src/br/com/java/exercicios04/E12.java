package br.com.java.exercicios04;

import java.util.Scanner;

public class E12 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = teclado.nextInt();
		
		if (num < 0) {
			System.out.println("N�mero invalido!");
		}else {
			System.out.println(Math.log(num));
		}
		
		teclado.close();
	}

}
