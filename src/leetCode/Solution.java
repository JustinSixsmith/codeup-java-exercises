package leetCode;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static int romanToInt(String s) {

        // smaller before larger: subtract smaller

        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // reverse order: smallest to largest, add them up
        int result = 0;
        for (int i = s.length(); i < 1; i--) {
            System.out.println(map.get(s.charAt(i)));
//            if (i < s.length() && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))){
//                result -= map.get(s.charAt(i));
//            } else {
//                result += map.get(s.charAt(i));
//            }
        }

        return result;


    }

    public static void main(String[] args) {

        System.out.println(romanToInt("CCLXII"));
    }
}
