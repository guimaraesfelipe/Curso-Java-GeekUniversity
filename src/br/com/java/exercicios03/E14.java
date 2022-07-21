package br.com.java.exercicios03;

import java.util.Scanner;

public class E14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o angulo em graus: ");
		float graus = teclado.nextFloat(), r;
		
		r = graus * 3.14f / 180;
		
		System.out.println(graus + " graus equivale a " + r + " radianos");
		
		teclado.close();
	}
}
