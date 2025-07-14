package javafundamentals;
import java.util.*;
public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		int sum=0;
		boolean skip=false;
		for(int num:arr) {
			if(num==6) {
				skip=true;
			}
			else if(num==7&&skip) {
				skip=false;
			}
			else if(!skip) {
				sum+=num;
			}
		}
		System.out.println(sum);

	}

}
