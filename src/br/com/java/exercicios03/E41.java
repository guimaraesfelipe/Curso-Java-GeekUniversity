package br.com.java.exercicios03;

import java.util.Scanner;

public class E41 {

	public static void main(String[] args) {
		/*Faça um programa que leia o valor da hora de trabalho (em reais) e número de horas trabalhadas no mês.
		 * Imprima o valor a ser pago ao funcionário, adicionando 10% sobre o valor calculado.
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da hora de trabalho: ");
		float valor_hora = teclado.nextFloat();
		
		System.out.println("Digite o número de horas trabalhadas no mês: ");
		float horas_trabalhadas = teclado.nextFloat();
		
		float valor = horas_trabalhadas * valor_hora, acrescimo = 10;
		
		System.out.println("O valor a ser pago para o funcionário com acrescimo de " + acrescimo + "% é: " + (valor + (valor * acrescimo) / 100));
		
		teclado.close();
	}
}
