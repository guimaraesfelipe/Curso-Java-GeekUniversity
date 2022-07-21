package br.com.java.exercicios03;

import java.util.Scanner;

public class E11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a velocidade em m/h: ");
		float ms = teclado.nextFloat(), km;
		
		km = ms * 3.6f;
		
		System.out.println(ms + " metros por segundo equivale a " + km + " quilometros por hora");
	
		teclado.close();
	}
}
