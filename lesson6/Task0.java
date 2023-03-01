import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

*/

class Task0{
    public static void main(String[] args) {
        Set<Integer> hashSet=new HashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(hashSet);

        Set<Integer> linkHashSet=new LinkedHashSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(linkHashSet);

        Set<Integer> treeSet=new TreeSet<>(List.of(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(treeSet);
    }
}