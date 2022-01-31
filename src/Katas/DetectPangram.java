package Katas;

import java.util.Locale;

public class DetectPangram {

    public boolean check(String sentence){

        for(char c = 'a'; c <= 'z'; c++){
            if(!sentence.toLowerCase(Locale.ROOT).contains("" + c)){
                return false;
            }
        }
        return true;
    }

}
