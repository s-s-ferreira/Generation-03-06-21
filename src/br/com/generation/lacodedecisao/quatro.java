package br.com.generation.lacodedecisao;

import java.util.Scanner;

public class quatro {

	public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	
	double numero, raiz, quadrado;
	
	System.out.println("Digite um n�mero: ");
	numero = entrada.nextInt();
	
	entrada.close();
	
	if(numero%2 == 0.0) {
		raiz = Math.sqrt(numero);
		System.out.println("O n�mero � par e sua raiz quadrada �: " + raiz);
	}
	else {
		quadrado = numero*numero;
		System.out.println("O n�mero � impar e elevado ao quadrado �: " + quadrado);
	}

	}

}
