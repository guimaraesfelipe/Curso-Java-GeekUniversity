package br.com.java.exercicios04;

/* A nota final de um estudante é calculada a partir de três notas atribuidas entre o intervalo de 0 até 10.
 * respectivamente a um trabalho de laboratório, a uma avaliação semestral e um exame final. A média das três notas mencionadas
 * anteriormente obedece aos pesos: Trabalho de laborátorio: 2, Avaliação Semestral: 3, Exame Final: 5.
 * De acordo com o resultado, mostre na tela se o aluno esta reprovado (média entre 0 e 2,9), de recuperação (entre 3 e 4.9)
 * ou se foi aprovado. Faça todas as verificações necessárias.
 */

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
