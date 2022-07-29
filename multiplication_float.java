// Program to Multiply two Floating Point Numbers 
package lalitjava;

import java.util.Scanner;

public class multiplication_float {
	public static void main(String[] args)
	{
		float a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		a = sc.nextFloat();
		
		System.out.println("Enter B : ");
		b = sc.nextFloat();
		
		c = a*b;
		System.out.println("Multipliction = "+c);
	}
}
 