import java.util.ArrayList;
import java.util.LinkedList;

class Task1{
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        long time = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            arrList.add(i);
        }
        System.out.println(System.currentTimeMillis()-time);

        LinkedList<Integer> arrList2 = new LinkedList<>();
        time = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            arrList2.add(i);
        }
        System.out.println(System.currentTimeMillis()-time);

    }
}