package br.com.curso.program;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas alturas você vai inserir");
		int n = sc.nextInt();
		double soma = 0;
		double[] vAltura = new double[n];
		
		System.out.println("Digite as alturas:");
		
		for(int i = 0 ; i < n ; i++) {
			vAltura[i] = sc.nextDouble();
			soma += vAltura[i];
			System.out.println("soma: "+ soma);
		}
		
		double media = soma / n;
		
		System.out.println("Media das alturas : "+ media);
		
		
		
		sc.close();
	}

}
