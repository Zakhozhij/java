
/*
Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
*/
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Homework2 {
    public static void main(String[] args) {
        Map<String, Integer> employers = new HashMap<>();
        ArrayList<String> emNames = new ArrayList<>();
        emNames.add("Смирнов");
        emNames.add("Игорев");
        emNames.add("Мопсов");
        emNames.add("Мопсов");
        emNames.add("Иванов");
        emNames.add("Иванов");
        emNames.add("Иванов");
        emNames.add("Смирнов");
        emNames.add("Смирнов");
        for (int i = 0; i < emNames.size(); i++) {
            if (employers.containsKey(emNames.get(i))) {
                employers.put(emNames.get(i), employers.get(emNames.get(i)) + 1);
            } else {
                employers.put(emNames.get(i), 1);
            }
        }
        ArrayList<Integer> countNames = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : employers.entrySet()) {
            countNames.add(entry.getValue());
        }

        countNames.sort(Comparator.naturalOrder());
        for (int i = countNames.size() - 1; i >= 0; i--) {
            for (Map.Entry<String, Integer> entry : employers.entrySet()) {
                if (entry.getValue() == countNames.get(i)) {
                    System.out.println(entry);
                    employers.remove(entry.getKey());
                    break;
                }
            }

        }

    }
}
