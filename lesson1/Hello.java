import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Hello {
    public static void main(String[] args) {
        //GetCurrentDateTime();
        //ShowUserName();
    }
    public static void GetCurrentDateTime(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd.MM.YYYY");
        System.out.println(formatter.format(now));
    }

    public static void ShowUserName(){
        System.out.printf("Введите имя пользователя:");
        Scanner sc = new Scanner(System.in, "cp866");
        String name = sc.nextLine();
        //System.out.println(String.format("Привет %s", name));
        System.out.printf(String.format("Привет %s\n", name));
        sc.close();
    }

    public static void maxInLine(){
        int[] array = new int[] {
            1,1,0,1,1,1
        };
    }
}
