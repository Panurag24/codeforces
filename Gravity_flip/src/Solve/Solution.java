package Solve;

import java.util.*;
import java.lang.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int arr[] = new int[a];
		for(int i= 0;i < a;i++) {
			arr[i] = sc1.nextInt();
		}
		
		Arrays.sort(arr);
		for(int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
