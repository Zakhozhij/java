
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Homework1 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phone = new HashMap<>();

        phone.put("Иван", new ArrayList<Integer>());
        phone.put("Дмитрий", new ArrayList<Integer>());
        phone.put("Георгий", new ArrayList<Integer>());
        phone.put("Инесса", new ArrayList<Integer>());
        phone.put("Андроид", new ArrayList<Integer>());

        phone.get("Иван").add(1);
        phone.get("Иван").add(2);
        phone.get("Иван").add(3);

        phone.get("Дмитрий").add(4);
        phone.get("Дмитрий").add(5);
        phone.get("Инесса").add(9);

        System.out.println(phone);
    }
}
