import java.util.Scanner;
import java.util.Stack;
//В калькулятор добавьте возможность отменить последнюю операцию.
public class Homework3 {
    public static void main(String[] args) {
        task3();
    }
    public static void task3() {
        Stack<Integer> listResults =  new Stack<Integer>();
        System.out.printf("Введите первое число:");
        Scanner sc = new Scanner(System.in);
        Integer firstNumber = sc.nextInt();
        Integer operation = 0;
        while(operation!=6){
            
            System.out.printf("Выберите операцию:\n1.*\n2./\n3.+\n4.-\n5.Отменить последнее действие\n6.Выход\n");
            operation = sc.nextInt();
            Integer result = 0;
            switch (operation) {
                
                case 1:
                    System.out.println("Умножение элементов");
                    break;
                case 2:
                    System.out.println("Деление элементов");
                    break;
                case 3:
                    System.out.println("Сложение элементов");
                    break;
                case 4:
                    System.out.println("Разность элементов");
                    break;
                case 5:
                    System.out.println("Результат удален из памяти ->" + listResults.pop()+"\n");
                    result=listResults.peek();
                    break;
                case 6:
                    break;
                default:
                    break;
            }
            if(operation>=1 && operation<=4){
                System.out.printf("Введите второе число:");
                Integer secondNumber = sc.nextInt();
                if(operation==1){
                    result = firstNumber * secondNumber;
                }else if(operation==2){
                    result = firstNumber / secondNumber;
                }else if(operation==3){
                    result = firstNumber + secondNumber;
                }else if(operation==4){
                    result = firstNumber - secondNumber;
                }
                listResults.push(result);
                System.out.println("Результат работы калькулятора ->" + result+"\n");
                System.out.println("Текущий список результатов ->"+listResults);
                firstNumber=result;
                
            }else if(operation==5){
                System.out.println("Текущий список результатов ->"+listResults);
                System.out.println("Текущий результат ->" + result+"\n");
                firstNumber=result;
            }
        }
        System.out.println("\n"+listResults);

        sc.close();
    }

}
