import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.Arrays;
//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Homework2 {
    public static void main(String[] args) {
        vial();
    }
    public static void vial(){
        System.setProperty("java.util.logging.SimpleFormatter.format",
              "[%1$tF %1$tT] [%4$-7s] %5$s %n");
        Logger logger = Logger.getLogger("MyLog"); 
        FileHandler fh; 
        try {  

            fh = new FileHandler("MyLogFile.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);   
        } catch (SecurityException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        } 
        int[] arr = {1,2,3,4,1,2,3,7,2};
        int x;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    x= arr[j];
                    arr[j]=arr[i];
                    arr[i]=x;
                    logger.info(arr[i]+" was replaced with "+arr[j]+" current array -> "+Arrays.toString(arr)); 
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
