package br.com.java.exercicios3;

import java.util.Scanner;

public class E04 {
	public static void main(String[] args) {
		//Leia um numero real e imprima o resultado do quadrado deste numero
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero real: ");
		float num = teclado.nextFloat();
				
		System.out.println("O quadrado de " + num + " � " + num * num);
		
		teclado.close();
	}
}
