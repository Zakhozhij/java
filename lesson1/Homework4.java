import java.util.Arrays;
import java.util.ArrayList;  
import java.util.Scanner;
//Task4 -> *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
public class Homework4 {
    public static void main(String[] args) {
        task4();
    }
    public static void task4(){
        //2? + ?5 = ?9 Integer.parseInt(str)
        Character a1,a2,b1,b2,c1,c2;
        Integer a_1,a_2,b_1,b_2,c_1,c_2;
        System.out.printf("Введите уравнение:");
        Scanner sc = new Scanner(System.in);
        String exercise = sc.nextLine();
        a1=exercise.charAt(0);
        a2=exercise.charAt(1);
        b1=exercise.charAt(5);
        b2=exercise.charAt(6);
        c1=exercise.charAt(10);
        c2=exercise.charAt(11);
        String[] array = new String[] {};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));  
        
        
        //System.out.println(Character.toString(a2));
         
        for(int i1=1;i1<10;i1++){
            if(Character.toString(a1).equals("?")){
                a_1=i1;
            }else{
                a_1=Integer.valueOf(Character.toString(a1));
            }
            for(int i2=0;i2<10;i2++){
                if(Character.toString(a2).equals("?")){
                    a_2=i2;
                }else{
                    a_2=Integer.valueOf(Character.toString(a2));
                }
                for(int i3=1;i3<10;i3++){
                    if(Character.toString(b1).equals("?")){
                        b_1=i3;
                    }else{
                        b_1=Integer.valueOf(Character.toString(b1));
                    }
                    for(int i4=0;i4<10;i4++){
                        if(Character.toString(b2).equals("?")){
                            b_2=i4;
                        }else{
                            b_2=Integer.valueOf(Character.toString(b2));
                        }
                        for(int i5=1;i5<10;i5++){
                            if(Character.toString(c1).equals("?")){
                                c_1=i5;
                            }else{
                                c_1=Integer.valueOf(Character.toString(c1));
                            }
                            for(int i6=0;i6<10;i6++){
                                if(Character.toString(c2).equals("?")){
                                    c_2=i6;
                                }else{
                                    c_2=Integer.valueOf(Character.toString(c2));
                                }
                                //System.out.println(((a_1*10+a_2)+"+"+(b_1*10+b_2))+"="+(c_1*10+c_2));
                                if(((a_1*10+a_2)+(b_1*10+b_2))==(c_1*10+c_2)){
                                    if(arrayList.contains(((a_1*10+a_2)+"+"+(b_1*10+b_2))+"="+(c_1*10+c_2))){

                                    }else{
                                        arrayList.add(((a_1*10+a_2)+"+"+(b_1*10+b_2))+"="+(c_1*10+c_2));
                                    }
                                        
                                }
                            }
                        }
                    }
                }
            }
        }
        array = arrayList.toArray(array);  
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
