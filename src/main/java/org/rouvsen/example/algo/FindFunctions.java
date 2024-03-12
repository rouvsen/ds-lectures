package org.rouvsen.example.algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindFunctions {
    public static void main(String[] args) {
        String[] arr = {"alex", "suarez", "ronaldo", "messi", "suarez", "ronaldo"};
        findDuplicatedWords(arr);
    }
    public static void findDuplicatedWords(String[] arr) {
        Set<String> setList = new HashSet<>();
        List<String> duplicatedListOfWords = new ArrayList<>();
        for (String el:arr) {
            if (setList.add(el)) {}
            else duplicatedListOfWords.add(el);
        }
        System.out.println(duplicatedListOfWords);
    }
}
