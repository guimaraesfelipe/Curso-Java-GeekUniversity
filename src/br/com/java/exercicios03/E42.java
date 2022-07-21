package br.com.java.exercicios03;

import java.util.Scanner;

public class E42 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o salário-base do funcionário: ");
		float salario = teclado.nextFloat();
		salario = salario + (salario * 5) / 100;
		
		System.out.println("O salário liquido a receber pelo funcionário é " + (salario - (salario * 7) / 100));
		
		teclado.close();
	}
}
