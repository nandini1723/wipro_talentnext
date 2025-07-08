package javafundamentals;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.nextLine().charAt(0);
		if(Character.isLowerCase(ch)) {
			System.out.println(Character.toUpperCase(ch));
		}
		else {
			System.out.println(Character.toLowerCase(ch));
		}
			
	}
		
}

	