package javafundamentals;
import java.util.*;
public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Set<Integer> set=new LinkedHashSet<>();
		for(int num:arr) {
			set.add(num);
		}
		Integer[] uniqueArr=set.toArray(new Integer[0]);
		System.out.println(Arrays.toString(uniqueArr));

	}

}
