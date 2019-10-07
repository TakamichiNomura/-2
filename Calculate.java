import java.util.*;
/**
 * Write a description of class Colculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculate extends teamproject2
{
    public static void main(String [] args){
        Iterator<String> it = hm.keySet().iterator();
        int total;
        while(it.hasNext()){
            String name = it.next();
            total =+ hm.get(name);            
        }
        System.out.println("------ 계산 결과 ------");
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + total / hm.size());
        
    }
}
