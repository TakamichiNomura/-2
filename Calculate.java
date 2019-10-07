import java.util.*;
import java.io.*;
/**
 * Write a description of class Colculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        System.out.println("평균 : " + (double)total / hm.size());       
    }
}
