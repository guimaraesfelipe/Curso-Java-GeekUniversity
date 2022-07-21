package br.com.java.exercicios04;

import java.util.Scanner;

public class E14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota do trabalho de laborátorio: ");
		float n_trabalholab = teclado.nextFloat();
		
		System.out.println("Digite a nota da avaliação semestral: ");
		float n_avaliacaosem = teclado.nextFloat();
		
		System.out.println("Digite a nota do exame final: ");
		float n_examefinal = teclado.nextFloat();
		
		float media = (n_trabalholab * 2) + (n_avaliacaosem * 3) + (n_examefinal * 5);
		
		if (media <= 2.9f) {
			System.out.println("REPROVADO");
		}else if (media >= 3 && media <= 4.9f) {
			System.out.println("RECUPERAÇÃO");
		} else {
			System.out.println("APROVADO");
		}
		
		teclado.close();
	}
}
