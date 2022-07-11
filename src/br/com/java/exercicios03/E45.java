package br.com.java.exercicios03;

import java.util.Scanner;

/* Faça um programa para converter uma letra maíuscula em letra minúscula.
 */

//Utilizado método toUpperCase() para transformar uma string em maiúscula. Ex: ola -> OLA
public class E45 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = teclado.next().toUpperCase();
		
		System.out.println(letra);
		
		teclado.close();
	}
}
