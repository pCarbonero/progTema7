package primerosinterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicio01 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList();
		
		for (int i=0; i<10; i++) {
			lista.add(i, i+1);
		}
		
		System.out.println(Arrays.toString(lista.toArray()));
		
		Collections.shuffle(lista);
		
		System.out.println(Arrays.toString(lista.toArray()));
		
	}// main
	
}
