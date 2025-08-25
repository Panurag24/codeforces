package Solve;

import java.util.*;
import java.lang.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		String s1 = sc1.nextLine();
		
		boolean fount = false;
		
		for(char c : s1.toCharArray()) {
			if(c == 'H' || c == 'Q' || c == '9') {
				fount = true;
				break;
			}
			
		}
		if(fount) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		

	}

}
