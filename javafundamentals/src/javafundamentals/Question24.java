package javafundamentals;
import java.util.*;
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] x=new int[size];
		int searchelement=sc.nextInt();
		int index=-1;
		for(int i=0;i<size;i++) {
			x[i]=sc.nextInt();
		}
		for(int i=0;i<x.length;i++) {
			if(x[i]==searchelement) {
				index=i;
				break;
			}
			
		}
		System.out.println(index);
		

	}

}
