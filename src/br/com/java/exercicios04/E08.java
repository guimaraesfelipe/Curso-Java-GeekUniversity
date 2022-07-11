package br.com.java.exercicios04;

/* Faça um programa que leia 2 notas de um aluno, verifique se as notas sao validas e exiba na tela a media destas notas.
 * Uma nota valida deve ser, obrigatoriamente, um valor entre 0.0 e 10.0, onde caso a nota nao possua valor valido,
 * este fato deve ser informado ao usuario e o programa terminar.
 */

import java.util.Scanner;

public class E08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		float nota1 = teclado.nextFloat();
		
		if (nota1 < 0 || nota1 > 10)  {
			System.out.println("Nota 1 invalida!");
			System.exit(0);
		}
		
		System.out.println("Digite a nota 2: ");
		float nota2 = teclado.nextFloat();
		
		if (nota2 < 0 || nota2 > 10)  {
			System.out.println("Nota 2 invalida!");
			System.exit(0);
		}
		
		System.out.println("O valor da média é " + (nota1 + nota2) / 2);
		
		
		teclado.close();

	}

}
