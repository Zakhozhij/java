import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        putArray(array);
        //showArray(array);
        System.out.println(percentUniqArray(array));
        
    }

    private static void putArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i <= 999; i++) {
            array[i] = rand.nextInt(25);
        }
    }

    private static float percentUniqArray(int[] array) {
        Set<Integer> uniq = new HashSet<>();
        for (int i = 0; i <= 999; i++) {
            uniq.add(array[i]);
        }
        System.out.println(uniq);
        return uniq.size()*100f/array.length;
    }

    private static void showArray(int[] array) {
        for (int i = 0; i <= 999; i++) {
            System.out.println(array[i]);
        }
    }

}
