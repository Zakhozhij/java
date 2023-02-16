import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
 */
public class Homework1 {
    public static void main(String[] args) {
        createQuery();
    }
    public static void createQuery(){
        try(BufferedReader brFile = new BufferedReader(new FileReader("hmw1.txt"));) {
            String str=brFile.readLine();
            int pos=str.lastIndexOf('}');
            String strEdited=str.substring(1,pos-1);
            String[] newString =  strEdited.replace("\"", "").split(", ");
            String result="SELECT * FROM students WHERE ";
            StringBuilder condition=new StringBuilder();
            for(String val:newString){
                String[] item=val.split(":");
                if (item[1].equals("null")==false){
                    condition.append(item[0]+"=\""+item[1]+"\" : ");
                }
            }
            String con2=condition.toString();
            int pos2=con2.lastIndexOf(':');
            String repl =  con2.substring(0,pos2-1).replace(":", "AND");
            System.out.println(result+repl);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
