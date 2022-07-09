package br.com.java.exercicios3;

import java.util.Scanner;

public class E32 {
	public static void main(String[] args) {
		//Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int num = teclado.nextInt(), triplo_num = num * 3, dobro_num = num * 2;
		
		System.out.println((triplo_num + 1) + (dobro_num - 1));
		
		teclado.close();
	}
}
