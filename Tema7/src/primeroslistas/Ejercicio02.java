package primeroslistas;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Ejercicio02 {

	public static void main(String[] args) {
		Set<Integer> lista = new LinkedHashSet();
		Random rn = new Random();
		
		while(lista.size() < 10) {
			int a = rn.nextInt(1, 21);
			if (!lista.contains(a)) {
				lista.add(a);
			}
		}//
		
		System.out.println(lista);

	}

}
