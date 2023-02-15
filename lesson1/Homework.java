/*
Task1 -> Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/
public class Homework {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        int n = 5;
        int summ = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            summ += i;
            mult *= i;
        }
        System.out.printf("Сумма чисел от 1 до %s = %s\nПроизведение чисел от 1 до %s = %s", n, summ, n, mult);
    }
}
