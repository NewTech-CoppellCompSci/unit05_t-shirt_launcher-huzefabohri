package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {

		problem1();
		problem2();
		problem3();
		problem4();

	}

	public static void problem1() {
		
		
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a postive integer: ");
		int num = inKey.nextInt();
		System.out.print("Enter another positive integer: ");
		int num2 = inKey.nextInt();
		
		double max = Math.max(num, num2);
		double min = Math.min(num, num2);
		
		double scope = max - min + 1;
		int rand = 0;	
		for(int i = 0 ; i < 100; i++) {
			
			rand = (int) (Math.random() * scope) + ((int)min);
			System.out.print(rand + " ");
			
		}
	System.out.println();
	}


	public static void problem2() {
		
		System.out.println();
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter the radius of a cylinder: \n");
		double radius = inKey.nextDouble();
		System.out.println("Enter the height of the cylinder: \n");
		double height = inKey.nextDouble();
		
		double circ = height * Math.PI * Math.pow(radius, 2);
		
			System.out.println(circ);
	}


	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter x1: \n");
		double x1 = inKey.nextDouble();
		
		System.out.println("Enter y1: \n");
		double y1 = inKey.nextDouble();
		
		System.out.println("Enter x2: \n");
		double x2 = inKey.nextDouble();
		
		System.out.println("Enter y2: \n");
		double y2 = inKey.nextDouble();
		
		double diff = x2 - x1;
		double diff1 = y2 - y1;
		
		double x = Math.pow(diff, 2);
		
		double y = Math.pow(diff1, 2);
		
		double total = x + y;
		
		double ans = Math.sqrt(total);
		
		System.out.print("Distance between points = " + ans + "\n");
		
	}

	
		public static void problem4() {
			Scanner inKey = new Scanner(System.in);
			
			System.out.println("Enter a-value: ");
			double a = inKey.nextDouble();
		
			System.out.println("Enter b-value: ");
			double b = inKey.nextDouble();
			
			System.out.println("Enter c-value: ");
			double c = inKey.nextDouble();
	
			double first = -b + Math.sqrt(Math.pow(b, 2) - 4 * (a) * (c));
			double second = -b - Math.sqrt(Math.pow(b, 2) - 4 * (a) * (c));
			double third = 2 * a;
			
			double x1 = first / third; 
			double x2 = second / third;
			
			System.out.println("x1 = " + x1 + "\n");
			System.out.println("x2 = " + x2 + "\n");
		
		}



}
