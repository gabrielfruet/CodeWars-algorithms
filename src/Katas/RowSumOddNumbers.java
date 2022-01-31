package Katas;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n){
        int firstNumber = n * (n - 1) + 1;
        int sum = (firstNumber * 2 + (n - 1) * 2) * n/2;
        return sum;
    }
}
