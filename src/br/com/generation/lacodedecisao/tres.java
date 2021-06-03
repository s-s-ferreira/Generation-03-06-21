package br.com.generation.lacodedecisao;

import java.util.Scanner;

public class tres {

	public static void main(String[] args) {
		
	int idade;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite sua idade: ");
	idade = entrada.nextInt();
	
	entrada.close();
	
	if(idade >= 10 && idade <= 14) {
		System.out.println("Categoria Infantil");
	}
	else if(idade >= 15 && idade <= 17) {
		System.out.println("Categoria Juvenil");
	}
	else if(idade >= 18 && idade <= 25) {
		System.out.println("Categoria Adulta");
	}

	}

}
