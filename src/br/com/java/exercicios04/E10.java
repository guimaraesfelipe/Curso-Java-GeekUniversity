package br.com.java.exercicios04;

import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float peso_ideal = 0;
		
		System.out.println("Digite sua altura: ");
		float altura = teclado.nextFloat();
		
		System.out.println("Digite seu sexo: ");
		String sexo = teclado.next().toUpperCase();
		
		if (sexo.startsWith("M")) {
			peso_ideal = (72.7f * altura) - 58;
		}else if (sexo.startsWith("F")) {
			peso_ideal = (62.1f * altura) - 44.7f;
		}else {
			System.out.println("Sexo invalido!");
			System.exit(0);
		}
		
		System.out.println("O seu peso ideal é: " + peso_ideal);
		
		teclado.close();
	}
}
