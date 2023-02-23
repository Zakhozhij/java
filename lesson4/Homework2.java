import java.util.LinkedList;
import java.util.Queue;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Homework2 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i <= 5; i++) {
            enqueue(list,i);
        }
        System.out.println(list);
        dequeue(list);
        System.out.println(list);
        first(list);

    }
    private static Queue<Integer> enqueue(Queue<Integer> list,int value){
        list.add(value);
        return list;
    }
    private static Queue<Integer> dequeue(Queue<Integer> list){
        System.out.println("Removed from queue : " + list.remove() );
        return list;
    }
    private static void first(Queue<Integer> list){
        System.out.println("First element from queue : " + list.peek());
    }
}
