package br.com.java.exercicios03;

import java.util.Scanner;

public class E41 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora de trabalho: ");
		float valor_hora = teclado.nextFloat();
		
		System.out.println("Digite o n�mero de horas trabalhadas no m�s: ");
		float horas_trabalhadas = teclado.nextFloat();
		
		float valor = horas_trabalhadas * valor_hora, acrescimo = 10;
		
		System.out.println("O valor a ser pago para o funcion�rio com acrescimo de " + acrescimo + "% �: " + (valor + (valor * acrescimo) / 100));
		
		teclado.close();
	}
}
