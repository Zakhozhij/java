import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lesson2
 */
public class Lesson2 {
    public static void main(String[] args) {
        
        //System.out.println(createStr());
        //System.out.println(checkPolindrom());
        //addToFile(repeatString("TEST"));
        getFilesTypesFromDirectory();
    }
    public static String createStr(){
        int n =15;
        char c1 = '1';
        char c2 = '0';
        short step = 1;
        StringBuilder str = new StringBuilder();
        while(n>=1){
            if(step==1){
                str.append(c1);
                step=2;
            }else{
                str.append(c2);
                step=1;
            }
            n--;
        }
        return str.toString();
    }
    public static Boolean checkPolindrom(){
        Boolean result;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите строку:");
        String str =scanner.nextLine();
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        if(str.equals(sb.toString())){
            result=true;
        }else{
            result=false;
        }
        scanner.close();
        return result;
    }

    private static String repeatString(String part) {
        StringBuilder fullPart=new StringBuilder();
        Integer amount =100;
        for(int i=0;i<amount;i++){
            fullPart.append(part);
        }
        return fullPart.toString();
    }
    private static void addToFile(String fullPart) {
        try(FileWriter file=new FileWriter("test.txt")) {
            file.append(fullPart);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void getFilesTypesFromDirectory() {
        String dirPath="D:/geekbrains/java/java/lesson2/";
        File dir = new File(dirPath);
      
        for(String file: dir.list()){
            int pos =file.lastIndexOf(".");
            if(pos==-1){
                continue;
            }
            System.out.println(file.substring(pos+1)); 
        }
    }
}