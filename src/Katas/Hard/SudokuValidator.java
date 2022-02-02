package Katas.Hard;

import java.util.ArrayList;
public class SudokuValidator {

    public static boolean check(int[][] sudoku) {
        return checkLine(sudoku) && checkColumn(sudoku) && checkSquare(sudoku);
    }

    public static boolean checkLine(int[][] sudoku){
        ArrayList<Integer> lineNumbers = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(lineNumbers.contains(sudoku[i][j]) || sudoku[i][j] < 1 || sudoku[i][j] > 9) return false;
                else lineNumbers.add(sudoku[i][j]);
            }lineNumbers.clear();
        }
        return true;
    }
    public static boolean checkColumn(int[][] sudoku){
        ArrayList<Integer> lineNumbers = new ArrayList<>();

        for(int j = 0; j < 9; j++){
            for(int i = 0; i < 9; i++){
                if(lineNumbers.contains(sudoku[i][j]) || sudoku[i][j] < 1 || sudoku[i][j] > 9) return false;
                else lineNumbers.add(sudoku[i][j]);
            }lineNumbers.clear();
        }
        return true;
    }
    public static boolean checkSquare(int[][] sudoku){
        ArrayList<Integer> lineNumbers = new ArrayList<>();

        for(int squareRow = 0; squareRow < 3; squareRow++){
            for(int squareColumn = 0; squareColumn < 3; squareColumn++){
                for(int i = squareRow*3; i < squareRow*3 + 3; i++){
                    for(int j = squareColumn*3; j < squareColumn*3 + 3; j++){
                        if(lineNumbers.contains(sudoku[i][j]) || sudoku[i][j] < 1 || sudoku[i][j] > 9) return false;
                        else lineNumbers.add(sudoku[i][j]);
                    }
                }lineNumbers.clear();
            }
        }
        return true;
    }
}
