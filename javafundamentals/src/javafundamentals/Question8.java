package javafundamentals;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		char c1=sc.next().charAt(0);
		char c2=sc.next().charAt(0);
		if(c1>c2) {
			System.out.println(c2+","+c1);
		}else {
			System.out.println(c1+","+c2);
		}
		
		

	}

}
