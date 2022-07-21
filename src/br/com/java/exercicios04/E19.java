package br.com.java.exercicios04;

import java.util.Scanner;

public class E19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		
		if (((num % 3) == 0 && ((num % 5) != 0)) || ((num % 5) == 0 && ((num % 3) != 0))) {
			System.out.println(num + " é divisivel por 3 OU 5");
		}else {
			System.out.println("O número não atende a solicitação.");
		}
		
		sc.close();

	}

}
