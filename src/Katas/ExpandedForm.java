package Katas;

public class ExpandedForm {

    public static String expandedForm(int num)
    {
        int numberSize = Integer.toString(num).length();
        StringBuilder builder = new StringBuilder();
        int[] digitsArray = new int[numberSize];
        for(int i = 0; i < numberSize; i++){

            int subtract = 0;
            subtract = (int)(num/Math.pow(10, numberSize - i))* 10;

            int decimal = (int) Math.pow(10, numberSize - i - 1);
            digitsArray[i] = num/decimal - subtract;
        }

        for(int i = 0; i < numberSize; i++){
            if(digitsArray[i] != 0){
                if(i != 0){
                    builder.append(" + ");
                }
                int decimal = (int) Math.pow(10, numberSize - i - 1);
                builder.append(digitsArray[i] * decimal);
            }
        }
        return builder.toString();
    }

}
