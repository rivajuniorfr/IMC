package Imc;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Paciente cliente = new Paciente ("Rivadavia",37,"masculino");
		Scanner entrada  = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		System.out.println("Digite sua altura: ");
		cliente.peso = entrada.nextDouble();
		cliente.altura = entrada.nextDouble();
		
		cliente.cliente();
		cliente.imc();
		cliente.alerta();
		

	}

}
