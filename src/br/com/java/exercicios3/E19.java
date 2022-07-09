package br.com.java.exercicios3;

import java.util.Scanner;

public class E19 {
	public static void main(String[] args) {
		//Leia um valor de volume em litros e apresente-o convertido em metros cubicos
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o volume em litros: ");
		float l = teclado.nextFloat(), mc;
		
		mc = l / 1000;
		
		System.out.println(l + " litros equivale a " + mc + " metros cubicos");
		
		teclado.close();
	}
}
