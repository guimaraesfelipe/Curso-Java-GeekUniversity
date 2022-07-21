package br.com.java.exercicios03;

import java.util.Scanner;

public class E13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a distancia em quilometros: ");
		float km = teclado.nextFloat(), milhas;
		
		milhas = km / 1.61f;
		
		System.out.println(km + " quilometros equivale a " + milhas + " milhas");
		
		teclado.close();
	}
}
