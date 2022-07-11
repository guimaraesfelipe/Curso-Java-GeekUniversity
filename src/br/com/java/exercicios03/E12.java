package br.com.java.exercicios03;

import java.util.Scanner;

public class E12 {
	public static void main(String[] args) {
		//Leia uma distancia em milhas e apresente-a convertida em quilometros
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a distancia em milhas: ");
		float milhas = teclado.nextFloat(), km;
		
		km = 1.61f * milhas;
		
		System.out.println(milhas + " milhas equivale a " + km + " quilometros");
		
		teclado.close();
	}
}
