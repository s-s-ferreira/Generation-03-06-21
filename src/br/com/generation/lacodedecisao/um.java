package br.com.generation.lacodedecisao;

import java.util.Scanner;

public class um {
	
	public static void main(String[] args) {
		
		int maior;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int numero3 = entrada.nextInt();
		
		entrada.close();
		
		if(numero1 > numero2 && numero1 > numero3) {
			maior = numero1;
		}
		else if(numero2 > numero3) {
			maior = numero2;
		}
		else {
			maior = numero3;
		}
		
		System.out.println("O maior número digitado foi: " + maior);

		}

}
