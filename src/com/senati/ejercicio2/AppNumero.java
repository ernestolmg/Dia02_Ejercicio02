package com.senati.ejercicio2;
import java.util.Scanner;
public class AppNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Numero Onum = new Numero();
			Scanner Leer = new Scanner(System.in);
			System.out.print("\n Ingrese el n�mero : ");
			double n = Leer.nextDouble();
			Onum.Num = n;
			System.out.println(" " + Onum.Primo());
			System.out.println(" " + Onum.Perfecto());
			System.out.println(" Factorial " + Onum.Factorial());
		}catch (Exception ex) {
			
		}	

	}

}
