package javafundamentals;
import java.util.*;
public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean isPrime=true;
		if(number>=1) {
			isPrime=false;
		}else {
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}
		if(isPrime)
			System.out.println(number+" is a prime number.");
		else
			System.out.println(number+" is not a prime number");
		

	}

}
