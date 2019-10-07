import java.io.*;
import java.util.*;
/**
 * Write a description of class teamproject2 here.
 *
 * @author (2018243144노무라타)
 * @version (a version number or a date)
 */
public class teamproject2
{
    public static void main(String[] args){
        var hm = new HashMap<String,Integer>();
        try{
            FileReader fr = new FileReader("d:\\inputData20191007.txt");
            int c;
            while((c = fr.read()) != -1){
                System.out.print((char)c);
            }
            fr.close();
        }catch(IOException e){
            System.out.println("파일이 없습니다.");
        }
    }
}
