package javafundamentals;
import java.util.*;
public class Question32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		only14(arr);
		System.out.println(only14(arr));
		// TODO Auto-generated method stub

	}
	public static boolean only14(int[] arr) {
		for(int num:arr) {
			
			if(num!=1&&num!=4) {
				return false;
			}
		}
		return true;
		
	}

}
