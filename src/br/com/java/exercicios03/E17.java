package br.com.java.exercicios03;

import java.util.Scanner;

public class E17 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do comprimento em centimetros: ");
		float centimetros = teclado.nextFloat(), polegadas;
		
		polegadas = centimetros / 2.54f;
		
		System.out.println(centimetros + " centimetros equivale a " + polegadas + " polegadas");
		
		teclado.close();
	}
}
