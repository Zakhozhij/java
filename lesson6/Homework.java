/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Homework {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop(1, "Acer", "Windows", "Red", 550, 4, 4200.5);
        Laptop lap2 = new Laptop(2, "Toshiba", "Linux", "Red", 400, 3, 3200.5);
        Laptop lap3 = new Laptop(3, "HP", "Windows", "Red", 600, 4, 4245.5);
        Laptop lap4 = new Laptop(4, "Lenovo", "Linux", "Black", 450, 5, 5200.0);
        Laptop lap5 = new Laptop(5, "Lenovo", "Linux", "Black", 500, 4, 4250.5);

        Set<Laptop> lapList = new HashSet<>();
        lapList.add(lap1);
        lapList.add(lap2);
        lapList.add(lap3);
        lapList.add(lap4);
        lapList.add(lap5);

        // System.out.println(lapList);
        Map<String, String> filter = new HashMap<>();
        filter.put("color", null);
        filter.put("hardDiskSize", null);
        filter.put("rAM", null);
        filter.put("oS", null);

        setFilter(filter);
        System.out.println(filter);

        for (Laptop lap : lapList) {
            Boolean show = false;

            if (filter.get("color") != null && lap.getColor().equals(filter.get("color"))) {
                show = true;
            } else if (filter.get("color") != null && lap.getColor().equals(filter.get("color")) == false) {
                continue;
            }

            if (filter.get("hardDiskSize") != null
                    && lap.getHardDiskSize() >= Integer.valueOf(filter.get("hardDiskSize"))) {
                show = true;
            }else if (filter.get("hardDiskSize") != null
                && lap.getHardDiskSize() < Integer.valueOf(filter.get("hardDiskSize"))) {
                continue;
            }
            if (filter.get("rAM") != null && lap.getrAM() >= Integer.valueOf(filter.get("rAM"))) {
                show = true;
            }else if (filter.get("rAM") != null && lap.getrAM() < Integer.valueOf(filter.get("rAM"))) {
                continue;
            }

            if (filter.get("oS") != null && lap.getoS().equals(filter.get("oS"))) {
                show = true;
            } else if (filter.get("oS") != null && lap.getoS().equals(filter.get("oS")) == false) {
                continue;
            }
            if (show) {
                System.out.println(lap);
            }

        }
    }

    private static void setFilter(Map<String, String> filter) {
        Scanner sc = new Scanner(System.in);
        Integer op = 1;
        while (op >= 1 && op <= 4) {
            System.out.println("текущее значение фильтра ->");
            filter.forEach((key, value) -> System.out.println(key + ":" + value));
            System.out.printf(
                    "Выберите операцию:\n1.Цвет\n2.Размер жесткого диска >\n3.Объем RAM\n4.Операционная система\n5.Выход\n");
            op = Integer.valueOf(sc.nextLine());
            switch (op) {
                case 1:
                    System.out.printf("Введите необходимый цвет -> ");
                    String color = sc.nextLine();
                    filter.put("color", color);
                    break;
                case 2:
                    System.out.printf("Введите размер жесткого диска -> ");
                    Integer hardSize = Integer.valueOf(sc.nextLine());
                    filter.put("hardDiskSize", Integer.toString(hardSize));
                    break;
                case 3:
                    System.out.printf("Введите объем RAM -> ");
                    Integer ram = Integer.valueOf(sc.nextLine());
                    filter.put("rAM", Integer.toString(ram));
                    break;
                case 4:
                    System.out.printf("Введите операционная систему -> ");
                    String os = sc.nextLine();
                    filter.put("oS", os);
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}
