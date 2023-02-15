//Task2 -> Вывести все простые числа от 1 до 1000
public class Homework2 {
    public static void main(String[] args) {
        task2();
    }
    public static void task2() {
        int n = 1000;
        int count;
        for (int i = 1; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i);
            }
        }

    }
}
