package javafundamentals;
import java.util.*;
public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int originalnumber=number;
		int reversed=0;
		while(number!=0) {
			int digit=number%10;
			reversed=reversed*10+digit;
			number=number/10;
			
		}
		System.out.println("Reversed number of "+originalnumber+"is: "+reversed);
		
	}


		

	

}
