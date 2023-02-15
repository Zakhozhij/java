import java.util.Scanner;
//Task3 -> Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
public class Homework3 {
    public static void main(String[] args) {
        task3();
    }
    public static void task3() {
        System.out.printf("Введите первое число:");
        Scanner sc = new Scanner(System.in);
        Integer firstNumber = sc.nextInt();
        System.out.printf("Введите второе число:");
        Integer secondNumber = sc.nextInt();
        System.out.printf("Выберите операцию:\n1.*\n2./\n3.+\n4.-\n");
        Integer operation = sc.nextInt();
        Integer result = 0;
        switch (operation) {
            case 1:
                result = firstNumber * secondNumber;
                break;
            case 2:
                result = firstNumber / secondNumber;
                break;
            case 3:
                result = firstNumber + secondNumber;
                break;
            case 4:
                result = firstNumber - secondNumber;
                break;
            default:
                break;
        }

        System.out.println("Результат работы калькулятора ->" + result);
        sc.close();
    }
}
