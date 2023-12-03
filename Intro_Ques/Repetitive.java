import java.util.*;

public class Repetitive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		int cnt = 1;
		int maxi = 1;
		for(int i = 1; i<input.length(); i++) {
			if(input.charAt(i) == input.charAt(i-1)) {
				cnt++;
			}
			else {
				cnt = 1;
			}
			maxi = Math.max(maxi, cnt);
		}
	    System.out.println(maxi);

	}

}
