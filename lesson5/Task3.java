
/*
Написать программу, определяющую правильность расстановки скобок в выражении.
*/
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку ->");
        String str = sc.nextLine();

        System.out.printf("Строка 1 -> %s \n", str);

        System.out.println(bracketsCheck(str));

        sc.close();
    }

    private static boolean bracketsCheck(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        brackets.put('<', '>');
        ArrayDeque<Character> openBrackets = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (brackets.containsKey(c)) {
                openBrackets.add(c);
            } else if (brackets.containsValue(c)) {
                if (openBrackets.isEmpty()) {
                    return false;
                } else {
                    char openningBracket = openBrackets.removeLast();
                    if (brackets.get(openningBracket) != c) {
                        return false;
                    }
                }
            }
        }
        return openBrackets.isEmpty();
    }
}
