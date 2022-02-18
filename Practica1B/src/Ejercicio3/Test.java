package Ejercicio3;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		Profesor[] profesores = new Profesor[3];
		Estudiante[] estudiantes = new Estudiante[2];
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese a continuación los datos de los profesores: \n\n");
		
		for (int i= 0; i < 3; i++) {
						
			System.out.print(" \nNombre: "); String  nombre= s.nextLine();
			
			System.out.print(" \nApellido: "); String  apellido = s.nextLine();
			
			System.out.print(" \nEmail: "); String  mail = s.nextLine();
			
			System.out.print(" \nCatedra: "); String  catedra = s.nextLine();
			
			System.out.print(" \nFacultad: "); String  facultad = s.nextLine();
			
			profesores[i] = new Profesor(nombre, apellido, mail, catedra, facultad); 
			
		}
		
		System.out.print("Ingrese a continuación los datos de los alumnos: \n\n");
		
		for (int i= 0; i < 2; i++) {
			
			System.out.print(" \nNombre: "); String nombre= s.nextLine();
			
			System.out.print(" \nApellido: "); String apellido = s.nextLine();
			
			System.out.print(" \nComision: "); String  comision = s.nextLine();
			
			System.out.print(" \nEmail: "); String  mail = s.nextLine();
			
			System.out.print(" \nDireccion: "); String  direccion = s.nextLine();
			
			estudiantes[i] = new Estudiante(nombre, apellido, comision, mail, direccion); 
			
		}
		
		s.close();
		
		System.out.print("Los datos de los profesores son los siguientes: \n\n");
		for (int i = 0; i < profesores.length; i++) {
			 System.out.println(profesores[i].tusDatos() + " \n ");
		}
		
		System.out.println();
		
		System.out.print("Los datos de los estudiantes son los siguientes: \n\n");
		for (int i = 0; i < estudiantes.length; i++) {
			 System.out.println(estudiantes[i].tusDatos() + " \n ");
		}

	}

}
