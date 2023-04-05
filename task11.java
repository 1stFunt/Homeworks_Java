// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            } else if (input.equals("print")) {
                Collections.reverse(strings);
                for (String s : strings) {
                    System.out.println(s);
                }
                Collections.reverse(strings);
            } else if (input.equals("revert")) {
                if (strings.size() > 0) {
                    strings.removeLast();
                } else {
                    System.out.println("Нет строк для удаления");
                }
            } else {
                strings.addLast(input);
            }
        }
        scanner.close();
    }
}