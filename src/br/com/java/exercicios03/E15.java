package br.com.java.exercicios03;

import java.util.Scanner;

public class E15 {
	public static void main(String[] args) {
		//Leia um �ngulo em radianos e apresente-o convertido em graus
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o �ngulo em radianos: ");
		float r = teclado.nextFloat(), graus;
		
		graus = r * 180 / 3.14f;
		
		System.out.println(r + " radianos equivale a " + graus + " graus");
		
		teclado.close();
	}
}
