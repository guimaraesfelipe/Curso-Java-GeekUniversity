package br.com.java.exercicios03;

import java.util.Scanner;

/* Fa�a um programa para converter uma letra ma�uscula em letra min�scula.
 */

//Utilizado m�todo toUpperCase() para transformar uma string em mai�scula. Ex: ola -> OLA
public class E45 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = teclado.next().toUpperCase();
		
		System.out.println(letra);
		
		teclado.close();
	}
}
