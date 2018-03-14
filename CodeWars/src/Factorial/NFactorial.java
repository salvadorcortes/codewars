package Factorial;

import java.math.BigDecimal;

public class NFactorial {
	public static void main(String[] args) {
		System.out.println(f(1));
		System.out.println(f(5));
		System.out.println(f(9));
		System.out.println(f(15));
		System.out.println(f(20));
		System.out.println(f(30));
		System.out.println(f(50));
	}
	
//	public static String f(int n){
//		return (n > 0 ? BigDecimal.valueOf(n).multiply(new BigDecimal(f(n-1))).toString() : "1");
//	}
	
	public static String f(int n){
		return (n > 0 ? String.valueOf(Double.valueOf(f(n-1))*n) : "1");
	}
}
