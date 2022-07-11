package br.com.java.exercicios03;

import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {
		//Leia uma velocidade em km/h e apresente-a convertida em m/s
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a velocidade em km/h: ");
		float km = teclado.nextFloat(), ms;
		
		ms = km / 3.6f;
		
		System.out.println(km + " quilometros por hora equivale a " + ms + " metros por segundo");
		
		teclado.close();
	}
}
