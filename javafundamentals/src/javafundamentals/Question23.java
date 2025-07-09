package javafundamentals;
import java.util.*;
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] a=new int[size];
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			
			
		}
		int max=Arrays.stream(a).max().getAsInt();
		int min=Arrays.stream(a).min().getAsInt();
		System.out.println("Maximun is: "+max);
		System.out.println("Minimun is: "+min);
	}

}
