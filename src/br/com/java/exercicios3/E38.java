package br.com.java.exercicios3;

import java.util.Scanner;

public class E38 {
	public static void main(String[] args) {
		//Leia o salário de um funcionário. Calcule e imprima o valor do novo salário, sabendo que ele recebeu um aumento de 25%
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário atual: ");
		float salario = teclado.nextFloat(), aumento = 25;
		
		System.out.println("O novo salário com aumento de " + aumento + "% é: " + (salario + (salario * aumento) / 100));
		
		teclado.close();
	}
}
