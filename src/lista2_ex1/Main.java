package lista2_ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número:");
		
		int num = sc.nextInt();
		
		if (num < 0)
			System.out.print("NEGATIVO");
		
		else
			System.out.print("NAO NEGATIVO");
	}
}
