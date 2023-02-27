//Поиск всех ивановых в словаре
import java.util.*;
class Task0{
    public static void main(String[] args) {
        Map<Integer,String> passportName = new HashMap<>();
        passportName.put(123456,"Иванов");
        passportName.put(321456,"Васильев");
        passportName.put(234561,"Петрова");
        passportName.put(234432,"Иванов");
        passportName.put(654321,"Петрова");
        passportName.put(345678,"Иванов");

        System.out.println(passportName);
        for (Map.Entry<Integer,String> entry : passportName.entrySet()) {
            if(entry.getValue().equals("Иванов")){
                System.out.println(entry);
            }
        }

    }
}