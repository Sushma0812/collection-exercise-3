package com.stackroute;

import java.util.*;

//This class is used to count the occurence of words in a given string.
public class NumbersOfStringCounts {
    public static void main(String args[]) {
        Map<String, Integer> stringCount = new HashMap<>();
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = reader.nextLine();
        String stringOne;
        //replace all the characters with blank space
        stringOne = string.replaceAll("[^a-zA-Z0-9]", " ");
        do {
            stringOne = stringOne.replaceAll("  ", " ");
        } while (stringOne.contains("  "));
        //split the words in the string by blank space
        String[] words = stringOne.split(" ");
        System.out.println(stringOne);
        for (String value : words) {
            //counts the occurrence of words in the given string
            if (stringCount.containsKey(value)) {
                int count = stringCount.get(value);
                stringCount.put(value, count + 1);
            } else {
                stringCount.put(value, 1);
            }
        }
        System.out.println(stringCount);
    }
}