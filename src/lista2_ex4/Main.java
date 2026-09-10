package lista2_ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Codigo do produto:");
		int codigo = sc.nextInt();
		
		System.out.print("Quantidade:");
		int qtd = sc.nextInt();
		
		switch (codigo)
		{
			case 1:
				System.out.printf("Total: R$ %.2f\n", qtd * 4.00);
					break;
				
			case 2:
				System.out.printf("Total: R$ %.2f\n", qtd * 4.50);
					break;
					
			case 3:
				System.out.printf("Total: R$ %.2f\n", qtd * 5.00);
					break;
			case 4:
				System.out.printf("Total: R$ %.2f\n", qtd * 2.00);
					break;
			case 5:
				System.out.printf("Total: R$ %.2f\n", qtd * 1.50);
					break;
		}		
	}

}
