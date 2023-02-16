import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
/*
В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, 
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
*/
public class Homework3 {
    public static void main(String[] args) {
        createQuery();
    }
    public static void createQuery(){
        try(BufferedReader brFile = new BufferedReader(new FileReader("hmw3.txt",StandardCharsets.UTF_8));) {
            String str=brFile.readLine();
            int pos=str.lastIndexOf(']');
            String strEdited=str.substring(1,pos);
            String[] newString =  strEdited.replace("\"", "").split(", ");
            StringBuilder result=new StringBuilder();
            String[] phrases={"Студент "," получил "," по предмету "};
            for(String val:newString){
                int pos2=val.lastIndexOf('}');
                String newVal=val.substring(1,pos2);
                String [] splitNewVal=newVal.split(",");
                for(int i=0;i<splitNewVal.length;i++){
                    String [] student=splitNewVal[i].split(":");
                    result.append(phrases[i]+student[1]);
                }
                result.append("\n");
            }
            System.out.println(result.toString());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
