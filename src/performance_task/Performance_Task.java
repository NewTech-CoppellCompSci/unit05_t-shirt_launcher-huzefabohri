package performance_task;

import java.util.Scanner;

public class Performance_Task {

	public static void main(String[] args) {
		
			
			
			System.out.println("Alright, lets do a T - SHIRT LAUNCHER!!!!");
			
			System.out.println();
			
			Scanner inKey = new Scanner(System.in);
			
			System.out.println("Enter the launch velocity (m/s): \n");
			double vel = inKey.nextDouble();	
			
			System.out.println("Enter the lauch angle (degrees): \n");
			double angle = inKey.nextDouble();
			
			double xpos = 0;
			double ypos = 1;
			int time = 0;
			boolean ground = true;
			
			System.out.println();
			System.out.println("Projectile's path: \n");
			
			while (ground) {
				
			xpos = Math.cos(Math.toRadians(angle)) * time * vel;
			ypos = Math.sin(Math.toRadians(angle)) * time * vel - 0.5 * 9.8 * Math.pow(time,2);
				
				if(ypos<0) {
					ground = false;
					ypos = 0;
				
				}
			System.out.println("Time: " + time + "\n");
				System.out.println("x-pos: " + xpos + "m \n");
				System.out.println("y-pos: " + ypos + "m \n");

				time++;
				
				
			}
		
			
			
		
		}
	
}
