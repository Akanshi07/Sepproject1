package Testing;

import java.util.Scanner;

public class Assigone {

	public static void main(String[] args) {
		System.out.println("Please enter x1 values:");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		System.out.println("Please enter x2 values:");
		int x2=s.nextInt();
		int a=x1+x2;
		System.out.println("Value of x1+x2 "+a);
		System.out.println("Please enter x3 values:");
		int x3=s.nextInt();
		int b=a-x3;
		System.out.println("Value of ((x1+x2)-x3) "+b);
		System.out.println("Please enter x4 values:");
		int x4=s.nextInt();
		int c=b+x4;
		System.out.println("Value of (((x1+x2)-x3)+x4) "+c);
		System.out.println("Please enter x5 values:");
		int x5=s.nextInt();
		int d=c*x5;
		System.out.println("Value of ((((x1+x2)-x3)+x4)*x5) "+d);
		System.out.println("Please enter x6 values:");
		int x6=s.nextInt();
		int e=d/x6;
		System.out.println("Value of (((((x1+x2)-x3)+x4)*x5)/x6) "+e);
	}
}
