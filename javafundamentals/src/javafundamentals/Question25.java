package javafundamentals;
import java.util.*;
public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] x=new int[size];
		
		
		for(int i=0;i<size;i++) {
			x[i]=sc.nextInt();
		}
		for(int value:x) {
			
			System.out.println((char)value);
		
		}
	}

}
