package javafundamentals;
import java.util.*;
public class Question9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			char ch=sc.nextLine().charAt(0);
			if((ch>'A'&&ch<'z')||(ch>'a'&&ch<'z')){
				System.out.println("Alphabet");
				
				
			}else if(ch>='0'&&ch<='9') {
				System.out.println("Digit");
			}
			else {
				System.out.println("Special Character");
			}
		
	}

}
