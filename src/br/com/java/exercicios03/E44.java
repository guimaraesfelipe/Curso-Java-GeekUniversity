package br.com.java.exercicios03;

import java.util.Scanner;

public class E44 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a altura do degrau em centimetros: ");
		float alt_degrau = teclado.nextFloat();
		
		System.out.println("Digite a altura que deseja alcançar subindo a escada, em centimetros: ");
		float objetivo = teclado.nextFloat();
		
		int quant_degraus = 0;
		float altura = 0;
		
		while (altura < objetivo) {
			altura = altura + alt_degrau;
			quant_degraus++;
		}
		
		System.out.println("Para chegar na altura desejada será necessario " + quant_degraus + " degraus");
		
		teclado.close();
	}
}
