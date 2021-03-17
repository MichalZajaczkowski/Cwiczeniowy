package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner enterNumberOfNames = new Scanner(System.in);
        System.out.print("Podaj ilość imion: ");
        int numberOfNames = enterNumberOfNames.nextInt();


        Scanner enterNames = new Scanner(System.in);
        System.out.println("Podaj imiona: ");
        String[] nameTab = new String[numberOfNames];

        //pobranie danych
        for (int i = 0; i < numberOfNames; i++) {
            nameTab[i] = enterNames.nextLine();
        }

        List<String> names = Arrays.asList(nameTab);
        Set<String> namesSet = new HashSet<>(names);
        // Map<String, Integer> mapName = new HashMap<>();

        //wyświetlenie najdłuższego imienia
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        System.out.println("Longest name: " + longestName);

        //wyświetlenie najkrótszego imienia

        String shortestName = longestName;

        for (String name : names) {
            if (name.length() < shortestName.length()) {
                shortestName = name;
            }
        }
        System.out.println("Shortest name: " + shortestName);
        int counter = 1;
        for (String word : namesSet) {
            int freq = Collections.frequency(names, word);
            if (counter < freq) {
                System.out.println(word + ": " + freq);
            }
        }
    }
}