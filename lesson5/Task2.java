import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
*/
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первую строку ->");
        String str1 = sc.nextLine();

        System.out.println("Введите вторую строку ->");
        String str2 = sc.nextLine();

        System.out.printf("Строка 1 -> %s \n",str1);
        System.out.printf("Строка 2 -> %s \n",str2);

        System.out.println(isomorphicCheck(str1,str2)); 
        
        sc.close();
    }
    private static boolean isomorphicCheck(String s1,String s2) {      
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Character> pairs = new HashMap<>();
        for(int i=0; i<s1.length();i++){
            if(pairs.containsKey(s1.charAt(i))){
                if(pairs.get(s1.charAt(i)).equals(s2.charAt(i))==false){
                    return false;
                }
            }else{
                pairs.put(s1.charAt(i),s2.charAt(i));
            }
        }
        return true;
    }
}
