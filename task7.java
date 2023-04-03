// Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20)); //
        }
        System.out.println(list);
        list.removeIf(n -> n % 2 == 0);
        System.out.println(list);
    }
}