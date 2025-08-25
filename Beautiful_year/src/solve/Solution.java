package solve;

import java.util.*;
import java.lang.*;

public class Solution {

	public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int y = sc1.nextInt();
        
        while(true) {
        	y++;
        	if(hasnoduplicate(y)) {
        		System.out.println(y);
        		break;
        	}
        }
    }
	public static boolean hasnoduplicate(int y) {
		String s1 = String.valueOf(y);
		List<Character> set1 = new ArrayList<Character>();
//		Set<Character> set1 = new HashSet<Character>();
		for(char c : s1.toCharArray()) {
			if(set1.contains(c)) {
				return false;
			}
			set1.add(c);
		}
		return true;
	}


}
