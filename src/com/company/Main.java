package com.company;

public class Main {

    public static void main(String[] args) {

        int[] tab = {107, 36, -3, 0, 27, 6};

        sort(tab);
        System.out.print("Zawartość posortowanej tablicy:");
        for (int tabElement : tab) {
            System.out.print(" " + tabElement);
        }
    }

    private static void sort(int[] tab) {
        int tabSize = tab.length;
        int counter = 0;
        for (int i = 0; i < tabSize; i++) {
            for (int j = 1; j < (tabSize - i); j++) {
                if (tab[j - 1] > tab[j]) {
                    counter = tab[j - 1];
                    tab[j - 1] = tab[j];
                    tab[j] = counter;
                }
            }
        }
    }
}