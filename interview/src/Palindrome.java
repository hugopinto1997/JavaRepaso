import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Palindrome {
    public boolean Palindrome(String palabra){
        int reverse = palabra.length() - 1;
         char [] c = palabra.toLowerCase().toCharArray();
        for (int i=0; i<palabra.length(); i++){
            System.out.print(c[i]);
            if(c[i] != c[reverse]){
                return false;
            }
            reverse--;
        }
        return true;
    }
}
