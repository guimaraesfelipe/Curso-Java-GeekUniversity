package br.com.java.exercicios03;

import java.util.Scanner;

public class E16 {
	public static void main(String[] args) {
		//Leia um valor de comprimento em polegadas e apresente-o convertido em centimetros
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do comprimento em polegadas: ");
		float polegadas = teclado.nextFloat(), centimetros;
		
		centimetros = polegadas * 2.54f;
		
		System.out.println(polegadas + " polegadas equivale a " + centimetros + " centimetros");
		
		teclado.close();
	}
}
