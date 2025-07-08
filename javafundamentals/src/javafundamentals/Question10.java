package javafundamentals;
import java.util.*;
public class Question10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		sc.nextLine();
		String gender=sc.nextLine();
		if(gender.equals("Female")&&(age>=1&&age<=58)) {
			System.out.println("The percentage of intrest is 8.2%");
			
		}
		else if(gender.equals("Female")&&(age>=59&&age<=100)) {
			System.out.println("The percentage of intrest is 9.2%");
		}
		else if(gender.equals("Male")&&(age>=1&&age<=58)) {
			System.out.println("The percentage of intrest is 8.4%");
		}
		else{
			
			System.out.println("The percentage of intrest is 10.5%");
		}
		
	}

}
