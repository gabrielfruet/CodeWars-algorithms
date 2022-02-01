package Main;

import Katas.Hard.ConwaysGameOfLife;

import java.sql.Time;
import java.util.Arrays;
import java.util.Random;

public class MainConways {



    public static void main(String[] args) {

        int[][] cells = new int[9][9];

        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length; j++){
                Random rand = new Random();
                cells[i][j] = Math.abs(rand.nextInt()) % 2;
            }
        }

        System.out.println(Arrays.deepToString(cells));

        cells = ConwaysGameOfLife.getGeneration(cells, 10);

        System.out.println(Arrays.deepToString(cells));


    }

}
