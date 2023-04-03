// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20)); //
        }
        System.out.println(list);
        int min = Collections.min(list);
        int max = Collections.max(list);
        int size = list.size();
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        double average = (double) sum / size;

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + average);
    }
}