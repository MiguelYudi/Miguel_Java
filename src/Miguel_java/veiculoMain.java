package Miguel_java;

import java.util.Scanner;

public class veiculoMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==CADASTRO DE CARRO==");
		System.out.println("Marca: ");
		String marca = sc.nextLine();
		
		System.out.println("Modelo: ");
		String modelo = sc.nextLine();
		
		System.out.println("Ano: ");
		int ano = sc.nextInt();
		
		System.out.println("Quantidade de portas: ");
		int  portas = sc.nextInt();
		sc.nextLine();
		
		carro car = new  carro(marca, modelo, ano, portas);
		
		
	}
		

}
