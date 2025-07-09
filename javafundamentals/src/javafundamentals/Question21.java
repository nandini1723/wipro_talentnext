package javafundamentals;
import java.util.*;
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int reversed=0;
		int originalnumber=number;
		while(number!=0) {
			int digit=number%10;
			reversed=reversed*10+digit;
			number=number/10;
		}
		if(originalnumber==reversed) 
			System.out.println(reversed+" is a palindrome");
			
		else
			System.out.println(reversed+" is not  Plindrome");
		

	}

}
