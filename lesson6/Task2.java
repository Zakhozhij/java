import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники

1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество. 
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

*/
public class Task2 {
    public static void main(String[] args) {
        Vaccination vac1 = new Vaccination("Стобняк", LocalDate.of(2023, 3, 1), "Bayer");
        Vaccination vac2 = new Vaccination("Коклюш", LocalDate.of(2022, 3, 1), "Bayer");
        // System.out.println(vac1);
        // System.out.println(vac1.getDate());
        // //vac1.setDate(LocalDate.of(2023, 2, 28));
        // System.out.println(vac1);
        Cat cat1 = new Cat("Барсик", "Олег", "Гладкошерстная", LocalDate.of(2023, 3, 1), "Красный");
        Cat cat2 = new Cat("Вася", "Оля", "Пушистик", LocalDate.of(2022, 3, 1), "Черный");
        Cat cat3 = new Cat("Вася", "Оля", "Пушистик", LocalDate.of(2022, 3, 1), "Черный");
        // System.out.println(cat1);
        cat1.addVaccination(vac1);
        cat1.addVaccination(vac2);
        // System.out.println(cat1);
        Set<Cat> catList = new HashSet<>();
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        //System.out.println(catList);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat3.equals(cat2));
    }
}
