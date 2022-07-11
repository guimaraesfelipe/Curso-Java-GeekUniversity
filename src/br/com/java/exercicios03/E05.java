package br.com.java.exercicios03;

import java.util.Scanner;

public class E05 {
	public static void main(String[] args) {
		//Leia um numero real e imprima a quinta parte deste numero
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número real: ");
		float num = teclado.nextFloat();
		
		System.out.println("A quinta parte de " + num + " é " + num / 5);
		
		teclado.close();
	}
}
