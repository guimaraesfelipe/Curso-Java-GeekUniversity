package br.com.java.exercicios03;

import java.util.Scanner;

public class E34 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio: ");
		float raio = teclado.nextInt(), area;
		
		area = 3.141592f * (raio * raio);
		
		System.out.println("A �rea do circulo �: " + area);
		
		teclado.close();
	}
}
