import java.util.*;
/**
 * Write a description of class Colculate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculate
{
    public static void main(String [] args){
        Set<String> Keys = hm.KeySet();
        Iterator<String> it = Keys.iterator();
        
        while(it.hasNext()){
            String name = it.next();
            int total =+ hm.get(name);            
        }
        System.out.println("------ 계산 결과 ------");
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + total / a.size());
        
    }
}
