package br.com.generation.lacodedecisao;

import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	double numero, raiz, quadrado;
	
	System.out.println("Digite um número: ");
	numero = entrada.nextInt();
	
	entrada.close();
	
	if(numero%2 == 0.0) {
		raiz = Math.sqrt(numero);
		System.out.println("O número é par e sua raiz quadrada é: " + raiz);
	}
	else {
		quadrado = numero*numero;
		System.out.println("O número é impar e elevado ao quadrado é: " + quadrado);
	}

	}

}
