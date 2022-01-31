package Katas;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

        int index = 0;
        int size = items.size();
        List<T> returned = new ArrayList<T>();

        while(items.size() > 0){
            index = (index + k - 1) % items.size();
            returned.add(items.get(index));
            items.remove(index);
        }
        return returned;

    }
}
