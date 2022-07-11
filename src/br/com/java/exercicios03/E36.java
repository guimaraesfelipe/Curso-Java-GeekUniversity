package br.com.java.exercicios03;

import java.util.Scanner;

public class E36 {

	public static void main(String[] args) {
		//Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro.
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a altura do cilindro: ");
		float altura = teclado.nextFloat();
		
		System.out.println("Digite o raio do cilindro: ");
		float raio = teclado.nextFloat();
		
		float volume = 3.141592f * (raio * raio) * altura;
		
		System.out.println("O volume do cilindro é: " + volume);
		
		teclado.close();
	}
}
