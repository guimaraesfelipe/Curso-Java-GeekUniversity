package br.com.java.exercicios03;

import java.util.Scanner;

public class E20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a massa em quilogramas: ");
		float kg = teclado.nextFloat(), libras;
		
		libras = kg / 0.45f;
		
		System.out.println(kg + " quilogramas equivale a " + libras + " libras");
		
		teclado.close();
	}

}
