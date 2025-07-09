package javafundamentals;
import java.util.*;
public class Question18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int originalnumber=number;
		int sum=0;
		while(number>0) {
			int digit=number%10;
			sum+=digit;
			number=number/10;
			
		}
		System.out.println("sum of the digits of"+originalnumber+"is: "+sum);
		
	}

}
