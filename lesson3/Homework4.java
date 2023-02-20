import java.util.ArrayList;
import java.util.Random;

/*
    Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
    Разность:
    A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
    B - A = все числа из второй коллекции, которые не содержатся в первой
    Симметрическая разность:
    A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой
 */
public class Homework4 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> B = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i <= rnd.nextInt(4); i++) {
            A.add(rnd.nextInt(15));
        }
        for (int i = 0; i <= rnd.nextInt(4); i++) {
            B.add(rnd.nextInt(15));
        }
        System.out.println(A);
        System.out.println(B);

        ArrayList<Integer> common = commonNumbers(A, B);
        // System.out.println(common);
        ArrayList<Integer> diffAB = diffAB(A, common);
        ArrayList<Integer> diffBA = diffBA(B, common);
        System.out.println("A - B -> " + diffAB);
        System.out.println("B - A -> " + diffBA);
        System.out.println("A ^ B  -> " + mergeLists(diffAB, diffBA));
    }

    private static ArrayList<Integer> commonNumbers(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            Integer a = A.get(i);
            for (int j = 0; j < B.size(); j++) {
                Integer b = B.get(j);
                if (a.compareTo(b) == 0 && result.indexOf(a) == -1) {
                    result.add(a);
                }
            }
        }
        return result;
    }

    private static ArrayList<Integer> diffAB(ArrayList<Integer> A, ArrayList<Integer> commonList) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            Integer a = A.get(i);
            for (int j = 0; j < commonList.size(); j++) {
                Integer b = commonList.get(j);
                if (a.compareTo(b) == 0) {
                    A.remove(i);
                    i--;
                }
            }
        }
        if (A.size() > 0) {
            for (int i = 0; i < A.size(); i++) {
                result.add(A.get(i));
            }
        }
        return result;
    }

    private static ArrayList<Integer> diffBA(ArrayList<Integer> B, ArrayList<Integer> commonList) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < B.size(); i++) {
            Integer b = B.get(i);
            for (int j = 0; j < commonList.size(); j++) {
                Integer a = commonList.get(j);
                if (b.compareTo(a) == 0) {
                    B.remove(i);
                    i--;
                }
            }
        }
        if (B.size() > 0) {
            for (int i = 0; i < B.size(); i++) {
                result.add(B.get(i));
            }
        }
        return result;
    }
    private static ArrayList<Integer> mergeLists(ArrayList<Integer> List1,ArrayList<Integer> List2){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < List1.size(); i++) {
            result.add(List1.get(i));
        }
        for (int i = 0; i < List2.size(); i++) {
            result.add(List2.get(i));
        }
        return result;
    }
}
