package br.com.java.exercicios3;

import java.util.Scanner;

public class E38 {
	public static void main(String[] args) {
		//Leia o sal�rio de um funcion�rio. Calcule e imprima o valor do novo sal�rio, sabendo que ele recebeu um aumento de 25%
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do sal�rio atual: ");
		float salario = teclado.nextFloat(), aumento = 25;
		
		System.out.println("O novo sal�rio com aumento de " + aumento + "% �: " + (salario + (salario * aumento) / 100));
		
		teclado.close();
	}
}
