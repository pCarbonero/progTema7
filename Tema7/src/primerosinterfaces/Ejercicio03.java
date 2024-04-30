package primerosinterfaces;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Map<Character, Integer> mapita = new TreeMap();
		
		String texto = "En un agujero en el suelo, vivia un hobbit. "
				+ "No un agujero humedo, sucio, repugnante, con restos de gusanos y olor a fango, "
				+ "ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";
		String nuevo = texto.toLowerCase().replaceAll("[^a-z]", "");
		
		char[] caracteres = texto.toCharArray();
		
		//System.out.println(Arrays.toString(caracteres));
		
		for (char c = 'a'; c<='z'; c++) {
			int cont = 0;
			for (int i = 0; i < caracteres.length; i++) {
				if (caracteres[i] == c) {
					cont++;
				}
			}
			mapita.put(c, cont);
		}
		
		System.out.println(mapita);
			
	}// main

}
