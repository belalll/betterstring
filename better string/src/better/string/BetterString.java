/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package better.string;




    
    
  import java.util.function.BiPredicate;

/**
 *
 * @author 20115
 */
public class BetterString {
    
    public static String betterString(String s1, String s2 ,BiPredicate<String, String>p) {
        if (p.test(s1, s2))
            return s1;
        else 
            return s2;
                    
    }

    
    public static void main(String[] args) {
        
        String string1 ="welocme"; 
        String string2 ="hello"; 
        String longer = BetterString.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length()); 
        String first = BetterString.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(longer);        // TODO code application logic here
    }
    
}
  
   