package lista2_ex3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora inicial:");
		int hora_inicial = sc.nextInt();
		
		System.out.print("Horal final:");
		int hora_final = sc.nextInt();
		
		int duracao;
		
		// caso de dois dias diferentes
		if (hora_inicial >= hora_final)
			duracao = (24 - hora_inicial) + hora_final;
		
		// caso de um dia
		else 
			duracao = hora_final - hora_inicial;
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
	}
}
