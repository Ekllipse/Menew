package br.com.curso.aplication;

import java.util.Locale;
import java.util.Scanner;

import br.com.curso.entities.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos produtos você vai adicionar?");
		int qtdProd = sc.nextInt();
		double soma = 0 ;
		
		Produto[] vProd = new Produto[qtdProd];
		
		System.out.println("Digite os dados do produto : ");
		for (int i = 0; i < qtdProd; i++) {
			System.out.println("Nome");
			String nome = sc.next();
			System.out.println("Preço");
			double preco = sc.nextDouble();
			
			vProd[i] = new Produto(nome, preco);
			soma += preco;
			
		}
		double media = soma / qtdProd;
		
		System.out.println("Media de valor dos produtos :" + media);
			sc.close();

	}

}
