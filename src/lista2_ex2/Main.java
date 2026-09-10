package lista2_ex2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número:");
	
		int num = sc.nextInt();
		
		if (num % 2 == 0)
			System.out.print("PAR");
		
		else
			System.out.print("IMPAR");
	}
}
