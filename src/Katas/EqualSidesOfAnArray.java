package Katas;

public class EqualSidesOfAnArray {

    public static int findEvenIndex(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int sumLEFT = 0;
            int sumRIGHT = 0;
            for(int l = 0; l < i; l++){
                sumLEFT += arr[l];
            }
            for(int r = i + 1; r < arr.length; r++){
                sumRIGHT += arr[r];
            }
            if(sumRIGHT == sumLEFT) return i;
        }
        return -1;


    }

}
