package Katas;

import java.util.HashMap;

public class SumOfIntervals {


    public static int sumIntervals(int[][] intervals) {
        HashMap<Integer, Boolean> contained = new HashMap<>();
        try{
            for(int[] interval : intervals){
                if(interval[0] - interval[1] != 0){
                    for(int count = interval[0]; count < interval[1]; count++){
                        contained.putIfAbsent(count, true);
                    }
                }
            }
        }catch(Exception ex){return 0;}

        return contained.size();
    }

}
