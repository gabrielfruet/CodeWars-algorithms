package Katas.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class parseIntReloaded {

    public static int parseInt(String numStr) {



        ArrayList<String> list = new ArrayList<>();
        numStr = numStr.replace(" and", "");
        Collections.addAll(list,numStr.split(" ") );

        int buffer = 0, total = 0;
        int actualState = 0;

        for (String s : list) {
            boolean skip = false;
            switch (s) {
                case "million" -> {
                    actualState = 2;
                    skip = true;
                }
                case "thousand" -> {
                    actualState = 1;
                    skip = true;
                }
            }
            if (skip) {
                total += buffer * Math.pow(10, actualState * 3);
                buffer = 0;
            } else {
                if (s.equals("hundred")) {
                    buffer *= 100;
                } else {
                    buffer += turnToNumber(s);
                }
            }
        }
        return total + buffer;
    }
    public static int turnToNumber(String number){

        HashMap<String, Integer> numerics = new HashMap<>();
        numerics.put("zero", 0);numerics.put("one", 1);numerics.put("two", 2);
        numerics.put("three", 3);numerics.put("four", 4);numerics.put("five", 5);
        numerics.put("six", 6);numerics.put("seven", 7);numerics.put("eight", 8);
        numerics.put("nine", 9);numerics.put("ten", 10);numerics.put("eleven", 11);
        numerics.put("twelve", 12);numerics.put("thirteen", 13);numerics.put("fourteen", 14);
        numerics.put("fifteen", 15);numerics.put("sixteen", 16);numerics.put("seventeen", 17);
        numerics.put("eighteen", 18);numerics.put("nineteen", 19);numerics.put("twenty", 20);
        numerics.put("thirty", 30);numerics.put("forty", 40);numerics.put("fifty", 50);
        numerics.put("sixty", 60);numerics.put("seventy", 70);numerics.put("eighty", 80);
        numerics.put("ninety", 90);numerics.put("hundred", 100);

        if(number.contains("-")){
            String[] splitted = number.split("-");
            return numerics.get(splitted[0]) + numerics.get(splitted[1]);
        }else{
            return numerics.get(number);
        }
    }

}
