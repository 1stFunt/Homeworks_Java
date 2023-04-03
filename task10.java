// Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.

import java.util.ArrayList;
import java.util.List;

public class task10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("rty");
        list.add("asd");
        list.add("123");
        list.add("456");

        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i);
                i--;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(list);
    }
}