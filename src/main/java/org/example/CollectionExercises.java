package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {

        String[] fruits ={"apple","banana","cherry","date","elderberry"};

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        String[] fruits = new String[3];

        for (int i = 0; i < fruits.length; i++) {
            fruits[i] = "apple";
        }
        return fruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {

        String[] topThree = new String[3];
            for (int i = 0; i < 3; i++) {
                topThree[i] = fruits[i];
            }
        return topThree;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        return null;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        return null;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        return null;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        return null;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        return null;
    }
}
