// Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class task9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20)); //
        }
        System.out.println(list);
        Set<Integer> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(list);
    }
}