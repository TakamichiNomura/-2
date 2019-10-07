import java.io.*;
import java.util.*;
/**
 * Write a description of class teamproject2 here.
 *
 * @author (2018243144노무라타카미치 , 2018315021 방대호)
 * @version (20191007)
 */
public class teamproject2
{
    public static void main(String[] args){
        var hm = new HashMap<String,Integer>();
        try{
            Scanner scan = new Scanner(new FileReader("c:\\Temp\\inputData20191007.txt"));
            while(scan.hasNext()){
                String word = scan.nextLine(); 
                StringTokenizer st = new StringTokenizer(word, " ");
                String name = st.nextToken();
                String s = st.nextToken();
                int score = Integer.parseInt(s);
            }
        }catch(IOException e){
            System.out.println("파일이 없습니다.");
        }
    }
}
