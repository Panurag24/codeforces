package even_odd;


import java.util.*;
import java.lang.*;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		int a1 = sc1.nextInt();
		int b1 = sc1.nextInt();
		int[] arr = new int[a1];
		int cnt = 0;
		
		for(int i = 1; i <= a1; i++) {
			if (i % 2 != 0) {
				arr[cnt++] = i;
			
			}
		}
		for(int i = 1; i <= a1; i++) {
			if (i % 2 == 0) {
				arr[cnt++] = i;
			}
		}
		 System.out.println(arr[b1 - 1]);

	}

}
