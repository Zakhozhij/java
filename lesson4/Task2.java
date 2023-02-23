import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида 
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

 */
public class Task2 {
    public static void main(String[] args) {
        
        System.out.println("Введите строку text~num");
        Scanner sc = new Scanner(System.in);
        String text= sc.nextLine();
        String[] textSplit = text.split("~");
        String txt=textSplit[0];
        Integer pos=Integer.parseInt(textSplit[1]);
        LinkedList<String> list = new LinkedList<String>();
        list.add(pos,txt);
        System.out.println(list);
        sc.close();
    }
}
