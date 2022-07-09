package br.com.java.exercicios3;

import java.util.Scanner;

public class E33 {
	public static void main(String[] args) {
		//Leia o tamanho do lado de um quadrado e imprima como resultado a sua area
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado do quadrado: ");
		int lado = teclado.nextInt(), area = lado * lado;
		
		System.out.println("A area do quadrado é: " + area);
		
		teclado.close();
	}
}
