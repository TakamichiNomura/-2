import java.io.*;
import java.util.*;
/**
 * Write a description of class teamproject2 here.
 *
<<<<<<< HEAD
 * @author (2018243144노무라타)
 * @version (a version number or a date)
=======
 * @author (2018243144노무라타카미치 , 2018315021 방대호)
 * @version (20191007)
>>>>>>> 7ecc0cb4da566e94c47ff9e4bf47f6eaeaeeb92a
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
                String score = st.nextToken();
            }
        }catch(IOException e){
            System.out.println("파일이 없습니다.");
        }
    }
}
