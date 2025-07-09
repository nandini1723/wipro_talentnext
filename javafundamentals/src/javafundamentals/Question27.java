package javafundamentals;
import java.util.*;
import java.util.Collections;
public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Integer[] x=new Integer[size];
		
		
		for(int i=0;i<size;i++) {
			x[i]=sc.nextInt();
		}
		Arrays.sort(x,Collections.reverseOrder());
		for(int value:x) {
			
			System.out.println(value);
		
		}
	}

}
