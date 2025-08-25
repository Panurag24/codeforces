package solve;

import java.util.*;

//import javax.swing.plaf.synth.SynthScrollPaneUI;

import java.lang.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();
		
		int max = Math.max(a + b + c, Math.max(a * (b + c), Math.max(a*b*c, (a + b)*c)));
		System.out.println(max);
	}

}
