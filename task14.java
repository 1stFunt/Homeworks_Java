// Написать метод, который переведёт данное целое число в римский формат.

import java.util.TreeMap;

public class task14 {
    private static final TreeMap<Integer, String> romanNumeralMap = new TreeMap<>();
    static {
        romanNumeralMap.put(1000, "M");
        romanNumeralMap.put(900, "CM");
        romanNumeralMap.put(500, "D");
        romanNumeralMap.put(400, "CD");
        romanNumeralMap.put(100, "C");
        romanNumeralMap.put(90, "XC");
        romanNumeralMap.put(50, "L");
        romanNumeralMap.put(40, "XL");
        romanNumeralMap.put(10, "X");
        romanNumeralMap.put(9, "IX");
        romanNumeralMap.put(5, "V");
        romanNumeralMap.put(4, "IV");
        romanNumeralMap.put(1, "I");
    }

    public static void main(String[] args) {
        int number = 2999;
        String romanNumeral = convertToRoman(number);
        System.out.println(romanNumeral);
    }

    public static String convertToRoman(int number) {
        int key = romanNumeralMap.floorKey(number);
        if (number == key) {
            return romanNumeralMap.get(number);
        }
        return romanNumeralMap.get(key) + convertToRoman(number - key);
    }
}