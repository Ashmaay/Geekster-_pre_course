package Assignments;

import java.util.Scanner;

public class perfect_square {
	static boolean perfectsquare(double x)
	{
		double sq = Math.sqrt(x);
		return ((sq - Math.floor(sq)) == 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter any number:");
		Scanner scanner = new Scanner(System.in);
		double num = scanner.nextDouble(); 
		scanner.close();

		if (perfectsquare(num)) 
			System.out.print(num+ "is a perfect square"); 
		else
			System.out.print(num+ " is not a perfect square");
			    }
			  }
		


