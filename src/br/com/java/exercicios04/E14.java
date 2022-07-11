package br.com.java.exercicios04;

/* A nota final de um estudante � calculada a partir de tr�s notas atribuidas entre o intervalo de 0 at� 10.
 * respectivamente a um trabalho de laborat�rio, a uma avalia��o semestral e um exame final. A m�dia das tr�s notas mencionadas
 * anteriormente obedece aos pesos: Trabalho de labor�torio: 2, Avalia��o Semestral: 3, Exame Final: 5.
 * De acordo com o resultado, mostre na tela se o aluno esta reprovado (m�dia entre 0 e 2,9), de recupera��o (entre 3 e 4.9)
 * ou se foi aprovado. Fa�a todas as verifica��es necess�rias.
 */

import java.util.Scanner;

public class E14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a nota do trabalho de labor�torio: ");
		float n_trabalholab = teclado.nextFloat();
		
		System.out.println("Digite a nota da avalia��o semestral: ");
		float n_avaliacaosem = teclado.nextFloat();
		
		System.out.println("Digite a nota do exame final: ");
		float n_examefinal = teclado.nextFloat();
		
		float media = (n_trabalholab * 2) + (n_avaliacaosem * 3) + (n_examefinal * 5);
		
		if (media <= 2.9f) {
			System.out.println("REPROVADO");
		}else if (media >= 3 && media <= 4.9f) {
			System.out.println("RECUPERA��O");
		} else {
			System.out.println("APROVADO");
		}
		
		teclado.close();
	}
}
