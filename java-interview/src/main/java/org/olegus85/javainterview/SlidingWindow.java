package org.olegus85.javainterview;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class SlidingWindow {
    public static void main(String[] args) {
        String inputString = "okkfog";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        String resultString = "";

        char[] array = inputString.toCharArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (!set.add(array[j])) {
                    String tempString = set
                            .stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(""));

                    if (resultString.length() < tempString.length()) {
                        resultString = tempString;
                    }
                    set.clear();
                    break;
                }
            }
        }
        System.out.printf("The answer is %s, with the length of %d", resultString, resultString.length());
    }
}

