package br.com.java.exercicios3;

import java.util.Scanner;

public class E43 {
	public static void main(String[] args) {
		/*Escreva um programa de ajuda para vendedores. A partir de um valor total lido, mostre:
		 * O total a pagar com desconto de 10%
		 * O valor de cada parcela, no parcelamento de 3x sem juros
		 * A comissão do vendedor, no caso da venda ser a vista (5% sobre o valor com desconto)
		 * A comissão do vendedor, no caso da venda ser parcelada (5% sobre o valor total)
		 */
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		float valor = teclado.nextFloat(), desconto = 10, comissao = 5;
		
		System.out.println("Valor a ser pago com " + desconto + "% de desconto a vista: " + (valor - (valor * 10) / 100));
		System.out.println("Valor a ser pago sem desconto: " + valor + " em até 3x de " + valor / 3 + " sem juros");
		System.out.println("Comissão de 5% para venda a vista: " + ((valor - (valor * 10) / 100) * comissao) / 100);
		System.out.println("Comissão de 5% para venda parcelada: " + ((valor * comissao) / 100));
		
		teclado.close();
	}
}
