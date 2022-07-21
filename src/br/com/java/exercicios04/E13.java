package br.com.java.exercicios04;

import java.util.Scanner;

public class E13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		float nota2 = teclado.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		float nota3 = teclado.nextFloat();
		
		float mp = (nota1 * 1) + (nota2 * 1) + (nota3 * 2);
		
		if (mp >= 60) {
			System.out.println("O aluno teve média " + mp + " e foi APROVADO");
		}else {
			System.out.println("O aluno teve média " + mp + " e foi REPROVADO");
		}
		
		teclado.close();
	}
	
}
