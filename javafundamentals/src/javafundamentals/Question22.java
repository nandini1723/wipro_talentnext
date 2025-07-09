 package javafundamentals;
import java.util.*;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] n=new int[size];
		
		int sum=0;
		for(int i=0;i<size;i++) {
			n[i]=sc.nextInt();
		}
		for(int num:n) {
			sum+=num;
			
		}
		
		double average=(double)sum/n.length;
		System.out.println("the sum of the array is:"+sum);
		System.out.println("the average of the aaray is:"+average);
		
		

	}

}
