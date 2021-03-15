package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(textWithDots(text));

    }

    private static int textWithDots(String s) {
        char[] chars = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '.'){
                counter++;
            }
        }
        return counter;
    }
}
