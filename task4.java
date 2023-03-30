// Напишите метод, который принимает на вход строку (String) и определяет 
// является ли строка палиндромом (возвращает boolean значение).

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println("Строка \"" + str + "\" является палиндромом");
        } else {
            System.out.println("Строка \"" + str + "\" не является палиндромом");
        }
    }

    public static boolean isPalindrome(String str) {
        String processedStr = str.toLowerCase().replaceAll("\\s", "");
        int left = 0, right = processedStr.length() - 1;
        while (left < right) {
            if (processedStr.charAt(left) != processedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // // или
    // public static Boolean isPalindrome(String s) {
    //     return s.equals((new StringBuilder(s)).reverse().toString());
    // }
}