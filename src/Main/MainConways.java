package Main;

import Katas.Hard.ConwaysGameOfLife;

import java.util.Random;

public class MainConways {

    public static void main(String[] args) {

        int[][] cells = new int[5][5];
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[0].length; j++){
                Random rand = new Random();
                cells[i][j] = Math.abs(rand.nextInt()) % 2;
            }
        }
        for(int count = 0; count < Integer.parseInt(args[0]); count++){
            System.out.println("Generation: " + count);
            try{
                cells = ConwaysGameOfLife.getGeneration(cells, count);
            }catch(NullPointerException ex){
                break;
            }
        }
    }

}
