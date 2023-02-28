package matriz;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		int linha = sc.nextInt();
		System.out.print("Colunas: ");
		int coluna = sc.nextInt();
		int[][] matriz = new int[linha][coluna];
		
		for (int l = 0; l<linha; l++) {
			for(int c = 0; c < coluna; c++) {
				System.out.printf("Linha %d e coluna %d: ", (l+1), (c+1));
				matriz[l][c] = sc.nextInt();
			}
		}
		
		System.out.println(matriz);
		
		sc.close();
	}

}
