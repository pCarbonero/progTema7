package primerosinterfaces;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio05 {
	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer> listaPelis = new TreeMap<>();
	public static void main(String[] args) {
		int opc = 0;
		
		do {
			menu();
			System.out.println("Elige una opción ");
			opc = sc.nextInt();
			sc.nextLine();
			
			switch (opc) {
			case 1: {
				addSerie();
				break;
			}
			case 2: {
				delSerie();
				break;
			}
			case 3: {
				System.out.println("La valoración de la serie es de " + buscarSerie());
				break;
			}
			default:
				System.out.println("Opción no válida ");
			}			
		} while (opc != 4);
		System.out.println("Has salido");
		
		

	}// main
	
	
	static void menu(){
		System.out.println("MENU");
		System.out.println("1. Add Serie");
		System.out.println("2. Buscar serie");
		System.out.println("3. Eliminar serie");
		System.out.println("4. Salir");
	}
	
	// añadir serie
	static void addSerie() {
		String nombre;
		int val;
		
		System.out.println("Nombre de la serie");
		nombre = sc.nextLine();
		
		System.out.println("Valoración de la serie");
		val = sc.nextInt();
		sc.nextLine();
			
		listaPelis.put(nombre, val);
	}
	
	// borrar serie
	static void delSerie() {
		String name;
		
		System.out.println("Nombre de la serie que quieres borrar ");
		name = sc.nextLine();
		
		listaPelis.remove(name);
	}
	
	static int buscarSerie(){
		String name;
		int valor;
		System.out.println("Nombre de la serie");
		name = sc.nextLine();
		valor = listaPelis.get(name);
		return valor;
	}

}
