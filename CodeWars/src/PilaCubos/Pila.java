package PilaCubos;

public class Pila {
	public static void main(String[] args) {
		System.out.println(findNb(1071225L));
		System.out.println(findNb(91716553919377L));
		System.out.println(findNb(4183059834009L));
		System.out.println(findNb(24723578342962L));
		System.out.println(findNb(135440716410000L));
		System.out.println(findNb(40539911473216L));
		System.out.println(findNb(1879122742888560401L));
		System.out.println(findNb(1575855093553310241L));
		
		
		
	}
	
	public static long findNb(long m) {
		long numero = 1;
		Long suma = Long.valueOf(0);
		do{
			suma = Long.sum(suma, Double.valueOf(Math.pow(numero++, 3)).longValue() );
		}
		while (suma < m);
		
		return (m == suma ? numero - 1 : -1);
	}	
}
