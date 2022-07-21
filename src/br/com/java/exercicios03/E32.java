package br.com.java.exercicios03;

import java.util.Scanner;

public class E32 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = teclado.nextInt(), triplo_num = num * 3, dobro_num = num * 2;
		
		System.out.println((triplo_num + 1) + (dobro_num - 1));
		
		teclado.close();
	}
}
