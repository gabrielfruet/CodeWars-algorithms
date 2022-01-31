package Katas;

import java.util.Vector;

public class ParityOrder {

    static int find(int[] integers){

        Vector<Integer> odd = new Vector<Integer>();
        Vector<Integer> even = new Vector<Integer>();

        for(int i = 0; i < integers.length; i++){
            if(integers[i] % 2 == 0){
                even.add(integers[i]);
            }else{
                odd.add(integers[i]);
            }
            if(even.size() > odd.size()){
                if(odd.size() == 1 && even.size() > 1) return odd.firstElement();

            }else{
                if(even.size() == 1 && odd.size() > 1) return even.firstElement();
            }

        }

        return 0;
    }

}
