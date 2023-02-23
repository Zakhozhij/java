import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения.
public class Homework4 {
    public static void main(String[] args) {
        String infix="x^y/(5*z)+10";
        System.out.println(infix);
        infixToPosfix(infix);
    }
    private static void infixToPosfix(String infix){
        Stack<String> stackList =  new Stack<String>();
        Queue<String> queueList =  new LinkedList<String>();
        String remEl="";
        for(int i=0;i<infix.length();i++){
            char item = infix.charAt(i);  
            if(Character.isDigit(item) || Character.isLetter(item)){
                queueList.add(String.valueOf(item));
            }else if(item=='*' || item=='/' || item=='+' || item=='-' || item=='^' || item=='(' || item==')'){
                String top="";
                if(stackList.size()>0){
                    top=stackList.peek();
                }
                String itemString=String.valueOf(item);
                if((itemString.equals(String.valueOf('+'))) && (top.equals(String.valueOf('-')) || top.equals(String.valueOf('*')) || top.equals(String.valueOf('/')) || top.equals(String.valueOf('^')) )){
                    while(stackList.size()>0 && top.equals(String.valueOf('+'))==false){
                        remEl=stackList.pop();
                        queueList.add(remEl);
                        if(stackList.size()>0){
                            top=stackList.peek();
                        }
                    }

                }else if((itemString.equals(String.valueOf('-'))) && (top.equals(String.valueOf('*')) || top.equals(String.valueOf('/')) || top.equals(String.valueOf('^')) )){
                    while(stackList.size()>0 && top.equals(String.valueOf('+'))==false){
                        remEl=stackList.pop();
                        queueList.add(remEl);
                        if(stackList.size()>0){
                            top=stackList.peek();
                        }
                    }

                }else if((itemString.equals(String.valueOf('*')) || itemString.equals(String.valueOf('/'))) 
                && (top.equals(String.valueOf('^')) )){
                    while(stackList.size()>0 && top.equals(String.valueOf('^'))==true){
                        remEl=stackList.pop();
                        queueList.add(remEl);
                        if(stackList.size()>0){
                            top=stackList.peek();
                        }
                    }

                }
                else if(itemString.equals(String.valueOf(')'))){
                   
                    while(top.equals(String.valueOf('('))==false){
                        remEl=stackList.pop();
                        queueList.add(remEl);
                        
                        if(stackList.size()>0){
                            top=stackList.peek();
                        }
                    }
                    if(top.equals(String.valueOf('('))){
                        stackList.pop();
                        top=stackList.peek();
                    }
                }
                if(itemString.equals(String.valueOf(')'))==false){
                    stackList.push(String.valueOf(item));
                }
            }

        }
        for(int i=0;i<stackList.size();i++){
            queueList.add(stackList.get(i));
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<queueList.size();i++){
            String cEl=queueList.remove();
            sb.append(cEl);
            i--;
        }


        System.out.println(sb.toString());
    }
}
