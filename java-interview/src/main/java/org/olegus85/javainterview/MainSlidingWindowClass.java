package org.olegus85.javainterview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainSlidingWindowClass {

    public static void main(String[] args) {
        System.out.println(getMaxUnequalSubstring("abcabck"));
    }

    public static String getMaxUnequalSubstring(String string) {
        char[] array = string.toCharArray();
        List<String> list = new ArrayList<>();
        String tempString;

        int leftPosition = 0;
        int rightPosition = 0;
        int afterWindowPosition = rightPosition + 1;
        char afterWindowChar;

        tempString = string.substring(leftPosition, rightPosition + 1);
        list.add(tempString);

        while (afterWindowPosition < array.length) {
            for (int i = leftPosition; i <= rightPosition; i++) {
                afterWindowChar = array[afterWindowPosition];
                if (afterWindowChar == array[i]) {
                    leftPosition = i + 1;
                }
            }
            rightPosition++;
            tempString = string.substring(leftPosition, rightPosition + 1);
            list.add(tempString);
            afterWindowPosition++;
        }

        return list.stream().max(Comparator.comparingInt(String::length)).get();
    }
}

