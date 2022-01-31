package Katas;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String aux = String.valueOf(num);
        int[] numbers = new int[aux.length()];

        for(int i = 0; i < numbers.length;i++){
            numbers[i] = aux.charAt(i) - 48;
        }

        for(int i = 0; i < aux.length(); i++){
            for (int j = 0; j < aux.length(); j++){
                if(numbers[i] > numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        int number = 0;

        for(int i = 0; i < numbers.length; i++){
            number += numbers[i] * Math.pow(10, numbers.length - i - 1);
        }

        return number;
    }
}
