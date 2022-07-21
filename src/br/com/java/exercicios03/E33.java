package br.com.java.exercicios03;

import java.util.Scanner;

public class E33 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado do quadrado: ");
		int lado = teclado.nextInt(), area = lado * lado;
		
		System.out.println("A area do quadrado é: " + area);
		
		teclado.close();
	}
}
