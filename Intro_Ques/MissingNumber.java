import java.util.*;

public class MissingNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sum = n*(n+1)/2;
		
		long temp = n-1;
		while(temp-->0) {
			long num = sc.nextLong();
			sum -= num;
		}
		System.out.println(sum);
	}

}
