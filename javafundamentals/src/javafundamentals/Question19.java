package javafundamentals;
import java.util.*;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int count=1;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				count++;
			}
			System.out.println();
				
		}
		

	}

}
