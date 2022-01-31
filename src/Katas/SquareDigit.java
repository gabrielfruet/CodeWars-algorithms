package Katas;

public class SquareDigit {

    public int squareDigits(int n) {

        String s = String.valueOf(n);

        int[] numeros = new int[s.length()];
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            numeros[i] = (int) Math.pow(s.charAt(i) - 48,2);
            builder.append(numeros[i]);
        }

        return Integer.parseInt(builder.toString());

    }

}