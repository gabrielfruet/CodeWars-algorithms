package Katas;

public class NumberOfTraillingZeros {

    public static int zeros(int n) {

        int zeros = 0;

        for(int i = 1; i <= n; i++){
            int aux = i;
            while(aux % 5 == 0){
                aux = aux/5;
                zeros++;
            }
        }
        return zeros;

    }

}
