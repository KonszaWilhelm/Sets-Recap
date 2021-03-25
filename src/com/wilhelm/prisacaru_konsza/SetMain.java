package com.wilhelm.prisacaru_konsza;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        //Symmetric / Asymmetric and bulk operations
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        //bulk ops
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union size: " + union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Intersection size: " + intersection.size());
        for (Integer i : intersection) {
            System.out.println(i + " is the square of: " + Math.sqrt(i) + " and the cube of: " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "One day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        printSet(words);

        //Asymmetric diff

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("\nNature takes divine: ");
        Set<String> diffOne = new HashSet<>(nature);
        diffOne.removeAll(divine);
        printSet(diffOne);

        System.out.println("\nDivine takes nature: ");
        Set<String> diffTwo = new HashSet<>(divine);
        diffTwo.removeAll(nature);
        printSet(diffTwo);

        //Asymmetric difference -> the elements that appear in one Set or the other but not both
        System.out.println("\nSymmetric difference: ");
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        unionTest.removeAll(intersectionTest);
        printSet(unionTest);

        //containsAll -> tests if a Set is a superset of another
        System.out.println();
        if (nature.containsAll(divine))
            System.out.println("Divine is a subset of nature");
        if (nature.containsAll(intersectionTest))
            System.out.println("IntersectionTest is a subset of nature");
        if (divine.containsAll(intersectionTest))
            System.out.println("IntersectionTest is a subset of divine");
    }

    public static void printSet(Set<String> set) {
        for (String str : set
        ) {
            System.out.print(str + " ");
        }
    }
}
