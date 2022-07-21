package br.com.java.exercicios03;

import java.util.Scanner;

public class E40 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		float valor_dia = 30, desconto = 8;
		
		System.out.println("Digite o número de dias trabalhados pelo encanador: ");
		int dias_trabalhados = teclado.nextInt();
		
		float valor_bruto = dias_trabalhados * valor_dia;
		
		System.out.println("O valor liquido a ser pago é: " + (valor_bruto - ((valor_bruto * desconto) / 100)));
		
		teclado.close();
	}
}
