package Arreglos;

import java.util.Arrays;
import java.util.List;

public class EnteroMinimo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> listaEnteros0 = Arrays.asList(34, 15, 88, 2);
		System.out.println(obtenMinimo(listaEnteros0));
		
		List<Integer> listaEnteros1 = Arrays.asList(34, -345, -1, 100);
		System.out.println(obtenMinimo(listaEnteros1));
		
		
		int[] valores = new int[]{78,56,232,12,11,43};
		obtenMinimoArray(valores);
		
	}
	
	public static Integer obtenMinimo(List<Integer> listaEnteros){
		int minimo = listaEnteros.get(0);
		for (Integer integer : listaEnteros) {
			if(integer < minimo){
				minimo = integer;
			}
		}
		return minimo;
	}
	
	public static Integer obtenMinimoArray(int[] valores){
		int minimo = valores[0];
		for (Integer integer : valores) {
			if(integer < minimo){
				minimo = integer;
			}
		}
		return minimo;
	}
}
