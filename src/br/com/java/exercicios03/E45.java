package br.com.java.exercicios03;

import java.util.Scanner;

public class E45 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra MAIÚSCULA: ");
		char maiuscula = teclado.next().charAt(0);
		char minuscula = (char) (maiuscula + 32);
		
		System.out.println(minuscula);
		
		teclado.close();
	}
}
