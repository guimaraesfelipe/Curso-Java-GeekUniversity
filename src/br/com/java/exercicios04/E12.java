package br.com.java.exercicios04;

/* Ler um numero inteiro. Se o numero lido for negativo, escreva a mensagem Numero invalido.
 * Se o numero for positivo, calcular o logaritmo deste numero.
 */

import java.util.Scanner;

public class E12 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = teclado.nextInt();
		
		if (num < 0) {
			System.out.println("Número invalido!");
		}else {
			System.out.println(Math.log(num));
		}
		
		teclado.close();
	}

}
