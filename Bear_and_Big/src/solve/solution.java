package solve;

import java.util.*;
import java.lang.*;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		int Limak = sc1.nextInt();
		int bob = sc1.nextInt();
		
		int cnt = 0;
		
		while(Limak <= bob) {
			Limak = Limak * 3;
			bob = bob * 2;
			cnt++;
		}
		System.out.println(cnt);
	}

}
