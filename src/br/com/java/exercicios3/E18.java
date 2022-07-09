package br.com.java.exercicios3;

import java.util.Scanner;

public class E18 {
	public static void main(String[] args) {
		//Leia um valor de volume em metros cubicos e apresente-o convertido em litros
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o volume em metros cubicos: ");
		float mc = teclado.nextFloat(), l;
		
		l = 1000 * mc;
		
		System.out.println(mc + " metros cubicos equivale a " + l + " litros");
		
		teclado.close();
	}
}
