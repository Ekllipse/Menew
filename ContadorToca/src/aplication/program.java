package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LinhaArq;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String path = "C:\\MVARANDAS\\BD\\Bancos\\toca2\\tocaimput.txt";
		
		double somaT = 0;
		
		List<LinhaArq> listV = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line =br.readLine();  
			
			
			while(line != null) {
				
				listV.add(new LinhaArq(Double.parseDouble(line.split("/	")[0]), Integer.parseInt(line.split("/	")[1])));
				line = br.readLine();
			}
			
			
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage() );
		}
		
		
		for(LinhaArq x : listV) {
			//System.out.println(somaT + " " + x.ValorFinal());
			somaT += x.ValorFinal();
			
		}
		System.out.println();
		System.out.printf("*** VALOR TOTAL DE NOTAS DUPLICADAS NO TOCA DO URSO: ***\n -------------> %.2f Reais <------------ ", somaT);
		
		
		sc.close();
		

	}

}
