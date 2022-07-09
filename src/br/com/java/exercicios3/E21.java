package br.com.java.exercicios3;

import java.util.Scanner;

public class E21 {

	public static void main(String[] args) {
		//Leia um valor de massa em libras e apresente-o convertido em quilogramas
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a massa em libras: ");
		float libras = teclado.nextFloat(), kg;
		
		kg = libras * 0.45f;
		
		System.out.println(libras + " libras equivale a " + kg + " quilogramas");
		
		teclado.close();
	}

}
