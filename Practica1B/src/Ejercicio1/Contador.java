package Ejercicio1;
import java.util.Scanner;

public class Contador {
	
	static void print_with_for(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}
	
	static void print_with_while(int a, int b) {
		while (a <= b) {
			System.out.print(a + " ");
			a++;
		} 
	}
	
	static void print_no_loop(int a, int b) {
		if (a <= b) {
			System.out.print(a + " ");
			print_no_loop(a+1, b);
		}
	}
	
	static int[] multiplos_de(int n) {
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = n * (i+1); 
		}
		
		return array;
	}
	
	
	public static void main(String[] args) {
		// Ejercicio 1
		print_with_for(3,9);
		System.out.println();
		print_with_while(4,10);
		System.out.println();
		print_no_loop(2,8);
		System.out.println("\n");
		
		// Ejercicio 2
		Scanner s = new Scanner(System.in);
		System.out.print("Ingrese un número entero mayor a 1: ");
		int n = s.nextInt();
		int[] arreglo = multiplos_de(n);
		s.close();
		
		for (int i = 0; i < n; i++) {
			System.out.print(arreglo[i] + " - ");
		}
		
	}

}
