package taxi;

import java.util.*;
import java.lang.*;

public class SOlution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int[] arr = new int[a];
		int sum = 0;
		for(int i = 0 ; i < a;i++) {
			arr[i] = sc1.nextInt();
			sum += arr[i];
		}
		int a1 = sum / 4;
//		System.out.println(sum);
//		System.out.println(a1);
		if(sum % 2 == 0) {
			System.out.println(a1);
		}else {
			a1++;
			System.out.println(a1);
		}
		
		
		
		

	}

}
