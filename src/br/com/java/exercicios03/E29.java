package br.com.java.exercicios03;

import java.util.Scanner;

public class E29 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		float nota2 = teclado.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		float nota3 = teclado.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		float nota4 = teclado.nextFloat();
		
		float resultado = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A média aritimética é: " + resultado);
		
		teclado.close();
	}
}
