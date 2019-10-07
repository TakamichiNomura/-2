import java.util.*;
import java.io.*;
/**
 * Write a description of class Colculate here.
 *
 * @author (2018243144노무라타카미치 , 2018315021 방대호)
 * @version (20191007)
 */
public class Calculate extends teamproject2
{
    public static void main(String [] args){
        HashMap<String,Integer> hm = MakeHasMap();
        Iterator<String> it = hm.keySet().iterator();
        int total = 0;
        while(it.hasNext()){
            String name = it.next();
            total += hm.get(name);            
        }
        System.out.println("------ 계산 결과 ------");
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + total / hm.size());
        System.out.println("평균 : " + (double)total / hm.size());  
    }
}
