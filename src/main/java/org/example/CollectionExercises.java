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

        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");
        fruitList.add("date");
        fruitList.add("elderberry");

        return fruitList;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {

        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("cherry");


        return fruitList;
    }

    public HashMap<String, String> makeFruitMap() {

        HashMap<String, String> fruitList = new HashMap<String, String>();

            fruitList.put("apple","red");
            fruitList.put("banana","yellow");
            fruitList.put("cherry","red");
            fruitList.put("date","brown");
            fruitList.put("elderberry","black");

        return fruitList;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {

        return fruitMap.get("apple");

    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitSet = new HashSet<String>();

        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("cherry");

        return fruitSet;
    }
}
