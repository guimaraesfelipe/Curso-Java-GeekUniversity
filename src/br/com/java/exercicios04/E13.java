package br.com.java.exercicios04;

import java.util.Scanner;

/* Faça um algoritmo que calcule a média ponderada das notas de 3 provas.
 * A primeira e a segunda prova tem peso 1 e a terceira tem peso 2.
 * Ao final mostrar a media do aluno e indicar se o aluno foi aprovado ou reprovado.
 * A nota para aprovação deve ser igual ou superior a 60 pontos
 * 
 * Mp = [(N1 x P1) + (N2 x P2) + (N3 x P3) + ... (Nx x Px)] ÷ (P1 + P2 + P3 + ... Px).
 */

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
