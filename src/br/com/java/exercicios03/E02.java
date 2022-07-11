package br.com.java.exercicios03;

import java.util.Scanner;

public class E02 {
	public static void main(String[] args) {
		//Faça um programa que leia um numero real e o imprima
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número real: ");
		float num = teclado.nextFloat();
		
		System.out.println("O número real digitado é: " + num);
		
		teclado.close();
	}
}
