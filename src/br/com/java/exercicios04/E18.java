package br.com.java.exercicios04;

import java.util.Scanner;

public class E18 {
	
	private static int somar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	private static int subtrair(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}
	
	private static int multiplicar(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}
	
	private static int dividir(int num1, int num2) {
		int resultado = num1 / num2;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o c�digo da opera��o matem�tica que deseja realizar: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		
		int opcao = sc.nextInt();
		
		if (opcao > 0 && opcao <= 4) {
			System.out.println("Digite o primeiro n�mero da opera��o: ");
			int num1 = sc.nextInt();
			
			System.out.println("Digite o segundo n�mero da opera��o: ");
			int num2 = sc.nextInt();
			
			switch (opcao) {
				case 1: {
					System.out.println("Resultado: " + somar(num1, num2));
					break;
				}
				case 2: {
					System.out.println("Resultado: " + subtrair(num1, num2));
					break;
				}
				case 3: {
					System.out.println("Resultado: " + multiplicar(num1, num2));
					break;
				}
				case 4: {
					System.out.println("Resultado: " + dividir(num1, num2));
					break;
				}
			}
		}else {
			System.err.println("Op��o invalida!");
		}
		sc.close();

	}

}
