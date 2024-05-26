package parralel.packege;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        int result = 0;
        int temp1 = 0;

        char[] charArray = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);

        for (int i = charArray.length - 1; i >= 0; i--) {
            temp1 = map.get(charArray[i]);
            if (i > 0) {
                if ((temp1 == 5 || temp1 == 10) && charArray[i - 1] == 'I') {
                    temp1 = temp1 - 1;
                    i--;
                }
            }
            if (i > 0) {
                if ((temp1 == 50 || temp1 == 100) && charArray[i - 1] == 'X') {
                    temp1 = temp1 - 10;
                    i--;
                }
            }
            result = result + temp1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("XCIV"));
    }
}
