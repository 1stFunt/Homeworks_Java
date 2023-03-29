// Задать одномерный массив и найти в нем минимальный и максимальный элементы.

import java.util.Arrays;

public class task1 {
    private static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    private static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(arr));
        System.out.println("Min is " + getMin(arr));
        System.out.println("Max is " + getMax(arr));
    }
}