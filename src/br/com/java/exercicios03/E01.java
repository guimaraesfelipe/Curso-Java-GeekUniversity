package br.com.java.exercicios03;

import java.util.Scanner;

public class E01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int num = teclado.nextInt();
		
		System.out.println("O número inteiro digitado foi: " + num);
		
		teclado.close();
	}

}
