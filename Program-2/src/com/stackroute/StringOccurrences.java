package com.stackroute;
import java.util.*;
//This class is used to check whether the string appears more than 2 times in a array
//If it appears more than two time display true else false
public class StringOccurrences{
    public static Map<String, Boolean> stringOccurrences(String[] array) {
        Map<String, Boolean> stringBooleanMap = new TreeMap<String, Boolean>();
        for (String stringOne : array) {
            //if the occurrence of string is less than two times it displays false
            if (!stringBooleanMap.containsKey(stringOne)) {
                stringBooleanMap.put(stringOne, False);
            }
            //if the occurrence of string is greater than or equal to two times it displays true
            else {
                stringBooleanMap.put(stringOne, True);
            }
        }
        System.out.println(stringBooleanMap);
        return stringBooleanMap;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = reader.nextInt();
        String[] array = new String[size];
        System.out.println("Enter elements of the string:");
        for (int i = 0; i < size; i++) {
            String userInput = reader.next();
            array[i] = userInput;
        }
        stringOccurrences(array);
    }
}