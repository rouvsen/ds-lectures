package org.rouvsen.example.algo;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFunctions {
    public static void main(String[] args) {
        String sentence = "alex suarez ronaldo messi suarez ronaldo";
//        findDuplicatedWords(arr);
        findDuplicatedWords2(sentence);
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
    public static void findDuplicatedWords2(String sentence) {
        List<String> list = new ArrayList<>();
        Map<String, Long> collected = Arrays.stream(sentence.split(" ")).collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting())
        );
        for(Map.Entry<String, Long> entry : collected.entrySet()) {
            if (entry.getValue() > 1)
                list.add(entry.getKey());
        }
        System.out.printf("%nDuplicated words are: %s%n", list);
    }
}
