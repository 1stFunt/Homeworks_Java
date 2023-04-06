// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;

public class task12 {
    public static void main(String[] args) {
        LinkedList<String> wordsList = new LinkedList<>();
        Collections.addAll(wordsList, "apple", "orange", "banana", "tomato", "strawberry", "melon");
        System.out.println(wordsList);

        for (int i = 0; i < wordsList.size() / 2; i++) {
            int j = wordsList.size() - i - 1;
            String temp = wordsList.get(i);
            wordsList.set(i, wordsList.get(j));
            wordsList.set(j, temp);
        }
        System.out.println(wordsList);
    }
}