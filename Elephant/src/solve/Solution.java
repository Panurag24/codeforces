package solve;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int steps = x / 5;  // full steps of 5
        if (x % 5 != 0) {
            steps++;  // need one more step for the remainder
        }

        System.out.println(steps);
    }
}
