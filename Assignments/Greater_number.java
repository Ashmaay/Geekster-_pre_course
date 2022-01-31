package Assignments;

public class Greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = 15.7, n2 = 2.69, n3 = 0.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
	}

}
