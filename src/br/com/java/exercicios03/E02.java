package br.com.java.exercicios03;

import java.util.Scanner;

public class E02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n?mero real: ");
		float num = teclado.nextFloat();
		
		System.out.println("O n?mero real digitado ?: " + num);
		
		teclado.close();
	}
}
