package Sumas;

public class Sum
{
   public static int GetSum(int a, int b)
   {
	   int suma = 0;
	   int mayor = a > b ? a : b;
	   int menor = a < b ? a : b;
	   if(a == b) return a;
	   for (; menor <= mayor; menor++) {
		   suma += menor;
	   }
    return suma;
   }
   
   public static void main(String[] args) {
	   System.out.println(GetSum(1, 0));
	   System.out.println(GetSum(1, 2));
	   System.out.println(GetSum(0, 1));
	   System.out.println(GetSum(1, 1));
	   System.out.println(GetSum(-1, 0));
	   System.out.println(GetSum(-1, 2));
	   System.out.println(GetSum(0, -1));
   }
}