import java.util.LinkedList;
import java.util.Random;

/*
 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */
public class Homework1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i <= rnd.nextInt(7); i++) {
            list.add(rnd.nextInt(15));
        }


        System.out.println(list);
        System.out.println(reverseList(list));
    }
    private static String reverseList(LinkedList<Integer> list){
        LinkedList<Integer> result = new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }

        return result.toString();
    }
}
