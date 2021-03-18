package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("write name: ");
        String name = scanner.nextLine();
        System.out.println(evenOrOdd(name));
    }

    private static boolean evenOrOdd(String name) {
        String[] strings = name.split("");
            if (strings.length % 2 == 0) {
                System.out.println("parzyste");
                return true;
            } else {
                System.out.println("nieparzyste");

        }
        return false;
    }
}