package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
	
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a postive integer: ");
		int input = inKey.nextInt();
		System.out.println("Enter another positive integer: ");
		int input1 = inKey.nextInt();
		
		System.out.println(input + "^" + input1 + " = " + Math.pow(input, input1) + "\n");

	}
	
	public static void problem2() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a postive number: ");
		int input = inKey.nextInt();
		System.out.println("The square root of " + input + " is " + Math.sqrt(input));
	
	
	
	}
	
	public static void problem3() {
		
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Length of side A: ");
		int A = inKey.nextInt();
		
		System.out.println("Length of side B: ");
		int B = inKey.nextInt();
	
		
		double total = Math.pow(A, 2) + Math.pow(B, 2);
	
		double hypot = Math.sqrt(total);
		
		System.out.println("Hypotenuse = " + hypot + "\n");
	}
	
	
	
		public static void problem4() {
		
		Scanner inKey = new Scanner(System.in);
			
			int input = -1;
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			

			while (input != 0) {
				System.out.print("Enter an integer: ");

				input = inKey.nextInt();
				min = Math.min(input, min);
				max = Math.max(input, max);
			}
			System.out.println("Max = " + max);
			System.out.println("Min = " + min + "\n");

			}
		}
