// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие.

import java.util.Calendar;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        String greeting;

        if (hour >= 5 && hour <= 11) {
            greeting = "Доброе утро";
        } else if (hour >= 12 && hour <= 17) {
            greeting = "Добрый день";
        } else if (hour >= 18 && hour <= 22) {
            greeting = "Добрый вечер";
        } else {
            greeting = "Доброй ночи";
        }
        
        System.out.printf("%s, %s!", greeting, name);

        scanner.close();
    }
}