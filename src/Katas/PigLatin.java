package Katas;

import java.util.Comparator;

public class PigLatin {

    public static String pigIt(String str) {
        String[] words = str.split(" ");
        String ignore = "!?.";
        StringBuilder builder = new StringBuilder();

        for(String s : words){
            boolean skip = false;
            for(char c : ignore.toCharArray()){
                if(s.contains(c + "")){skip = true;break;}}
            if(!skip){
                builder.append(s.substring(1, s.length())).append(s.charAt(0)).append("ay ");
            }else{
                builder.append(s).append(" ");
            }
        }

        return builder.substring(0, builder.length() - 1);
    }

}
