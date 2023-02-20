import java.util.ArrayList;
import java.util.Random;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
public class Homework3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        for(int i=0;i<5;i++){
            list.add(rnd.nextInt(15));
        }
        System.out.println(list);
        minValue(list);
        maxValue(list);
        ArithmeticMean(list);
    }
    private static void minValue(ArrayList<Integer> list){
        int min=list.get(0);
        for(int i=0;i< list.size();i++ ){
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        System.out.println("Минимальное число -> " + min);
    }
    private static void maxValue(ArrayList<Integer> list){
        int max=list.get(0);
        for(int i=0;i< list.size();i++ ){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println("Максимальное число -> " + max);
    }
    private static void ArithmeticMean(ArrayList<Integer> list){
        float summ=0;
        for(int i=0;i< list.size();i++ ){
            summ+=list.get(i);
        }
        float result=summ/list.size();
        System.out.println("Среднее арифметическое -> " +result);
    }
}
