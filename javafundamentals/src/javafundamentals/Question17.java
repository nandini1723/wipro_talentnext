package javafundamentals;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i<=99;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
			}
		}

	}
	public static boolean isPrime(int n) {
		if(n<=1) 
			return false;
		
		if(n==2) 
			return true;
		
		if(n%2==0) 
			return false;
		for(int i=3;i*i<=n;i+=2) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
			
	}

}
