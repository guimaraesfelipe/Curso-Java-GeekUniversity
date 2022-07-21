package br.com.java.exercicios03;

import java.util.Scanner;

public class E21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a massa em libras: ");
		float libras = teclado.nextFloat(), kg;
		
		kg = libras * 0.45f;
		
		System.out.println(libras + " libras equivale a " + kg + " quilogramas");
		
		teclado.close();
	}

}
