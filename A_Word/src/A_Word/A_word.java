package A_Word;

import java.util.Scanner;

public class A_word {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String temp = scn.next();
        int upper = 0;
        int lower = 0;

        for (char ch : temp.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }
        }

        if (upper > lower) {
            System.out.println(temp.toUpperCase());
        } else {
            System.out.println(temp.toLowerCase());
        }

        scn.close();
    }
}
