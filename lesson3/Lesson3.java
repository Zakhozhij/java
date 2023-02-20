import java.util.ArrayList;
import java.util.Random;


class Lesson3 {
    public static void main(String[] args) {
        //sortCollection();
        //planets();
        removeNumbers();
    }
    //Заполнить список десятью случайными числами. Отсортировать список методом sort() и вывести его на экран.
    private static void sortCollection(){
        ArrayList<Integer> collection = new ArrayList<>();
        Random rnd = new Random();
        for(int i=0;i<10;i++){
            collection.add(rnd.nextInt(15));
        }
        System.out.println(collection);
        collection.sort(new MyComparator());
        System.out.println(collection);
    }
    /*
        Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
        Вывести название каждой планеты и количество его повторений в списке.
    */
    private static void planets(){
        ArrayList<String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Марс");
        System.out.println(planets);
        ArrayList<String> namesPlanets = new ArrayList<>();
        ArrayList<Integer> countPlanets = new ArrayList<>();
        
        for(String item : planets ){
            int pos=namesPlanets.indexOf(item);
            if (pos!=-1){
                countPlanets.set(pos,countPlanets.get(pos)+1);
            }else{
                namesPlanets.add(item);
                countPlanets.add(1);
            }
        }
        for(String item : namesPlanets ){
            int pos=namesPlanets.indexOf(item);
            System.out.printf("%-10s %3d \n",item,countPlanets.get(pos));
        }
        System.out.println("----------------");
        for(int i=0;i< namesPlanets.size();i++ ){
            if(countPlanets.get(i)>1){
                namesPlanets.remove(i);
                countPlanets.remove(i);
                continue;
            }
            System.out.printf("%-10s %3d \n",namesPlanets.get(i),countPlanets.get(i));
        }
    }
    /*
        Создать список типа ArrayList<String>.
        Поместить в него как строки, так и целые числа.
        Пройти по списку, найти и удалить целые числа.
    */    
    private static void removeNumbers(){
        ArrayList list = new ArrayList<String>();
        list.add("Земля");
        list.add(1);
        list.add("Сатурн");
        list.add(2);
        list.add(3);
        list.add("Марс");
        System.out.println(list);
        for(int i=0;i< list.size();i++ ){
            if(list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

}
