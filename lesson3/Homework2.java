import java.util.ArrayList;
import java.util.Random;

//Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
public class Homework2 {
    public static void main(String[] args) {
        removeEvenNumbers();
    }
    private static void removeEvenNumbers(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        for(int i=0;i<10;i++){
            list.add(rnd.nextInt(15));
        }
        System.out.println(list);
        for(int i=0;i< list.size();i++ ){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
