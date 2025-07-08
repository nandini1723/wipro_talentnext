package javafundamentals;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Given integer is positive");
		}
		else if(a<0) {
			System.out.println("Given integer is Negative");
			
			
		}
		else {
			System.out.println("Given integer is zero");
		}

	}

}
