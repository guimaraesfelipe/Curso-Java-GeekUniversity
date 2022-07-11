package br.com.java.exercicios04;

import java.util.Scanner;

/* Faça um programa que calcule e mostre a árrea de um trapézio.
 * 
 */

public class E17 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a base maior: ");
		float base_maior = teclado.nextFloat();
		
		System.out.println("Digite a base menor: ");
		float base_menor = teclado.nextFloat();
		
		System.out.println("Digite a altura: ");
		float altura = teclado.nextFloat();
		
		float trapezio = ((base_maior + base_menor) * altura) / 2;
		
		System.out.println("A área do trapézio é " + trapezio);
		
		teclado.close();
	}
}
