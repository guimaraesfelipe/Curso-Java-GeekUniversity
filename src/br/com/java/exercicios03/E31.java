package br.com.java.exercicios03;

import java.util.Scanner;

public class E31 {
	public static void main(String[] args) {
		//Leia um numero inteiro e imprima o seu antecessor e o seu sucessor
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = teclado.nextInt(), antecessor = num - 1, sucessor = num + 1;
		
		System.out.println("O antecessor de " + num + " � " + antecessor + " e o sucessor � " + sucessor);
		
		teclado.close();
	}
}
