package br.com.java.exercicios04;

import java.util.Scanner;

/* Leia um número fornecido pelo usuário. Se esse numero for positivo, calcule a raiz quadrada do numero.
 * Se o numero for negativo, mostre uma mensagem dizendo que o número é invalido. 
 */

public class E02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = Integer.parseInt(teclado.nextLine());
		
		if (num >= 0) {
			System.out.println(Math.sqrt(num));
		}else {
			System.out.println("Número invalido");
		}
		
		teclado.close();
	}
	
}
