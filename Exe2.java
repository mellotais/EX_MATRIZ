package Matriz;
import java.util.Scanner;
public class Exe2 {
	
	public static void main (String [] args) {
		
		Scanner entrada = new Scanner(System.in);

		int soma = 0;
		int maior = 0;
		int menor = 0;
		float media = 0;
		final int LIN = 5;
		final int COL = 5;
		
		
		int[][] vet = new int[LIN][COL];

		for (int lin = 0; lin < LIN; lin++) {
			for (int col = 0; col < COL; col++) {
				System.out.print("Informe o preço de cinco produtos dos cinco supermercados: ");
				vet[lin][col] = entrada.nextInt();
				soma = soma + vet[lin][col];
				//soma += vet[x];
				
				//o primeiro valor é o maior e o menor;
				if (lin == 0 &&  col == 0){
					maior = vet[lin][col];
					menor = vet[lin][col];
				}
				else {
					if (maior < vet[lin][col])
						maior = vet[lin][col];
					if (menor > vet[lin][col])
						menor = vet[lin][col];
				}
			}
		}

		for (int lin = 0; lin < LIN; lin++) {
			System.out.println();
			for (int col = 0; col < COL; col++) 
				System.out.print(vet[lin][col] + " | ");
		}

		System.out.println("\nSoma: " + soma);

		media = soma / (float)(LIN * COL);
		System.out.println("Média: " + media);

		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);

		entrada.close();
	}

	}