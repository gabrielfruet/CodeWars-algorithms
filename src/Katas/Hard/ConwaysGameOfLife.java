package Katas.Hard;

public class ConwaysGameOfLife {

    public static void printGame(int[][] cells){
        System.out.print("_");
        for(int i = 0; i < cells[0].length; i++){
            System.out.print("_");
        }
        System.out.println("_");
        for (int[] cell : cells) {
            System.out.print("|");
            for (int j = 0; j < cells[0].length; j++) {
                if (cell[j] == 1) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }
    }

    public static int[][] getGeneration(int[][] cells, int generations){

        for(int times = 0; times < generations; times++) {
            try{
                cells = step(cells);
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("All cells are dead.");
                return null;
            }
        }
        cells = crop(cells);
        printGame(cells);
        return cells;
    }

    private static int checkNeighbours(int[][] cells, int i, int j){
        int livingNeighbours = 0;
        for(int row = i - 1; row < i + 2; row++){
            for(int column = j - 1; column < j + 2; column++){
                if(column != j || row != i ){
                    try{
                        livingNeighbours += cells[row][column];
                    }catch(ArrayIndexOutOfBoundsException ex){
                        livingNeighbours += 0;
                    }
                }
            }
        }
        return livingNeighbours;
    }

    private static int[][] step(int[][] cells){

        int[][] temp = new int[cells.length + 2][cells[0].length + 2];

        cells = grows(cells);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                try {
                    int livingNeighbours = checkNeighbours(cells, i, j);
                    if (cells[i][j] == 1) {
                        if (livingNeighbours < 2 || livingNeighbours > 3) {
                            temp[i][j] = 0;
                        } else {
                            temp[i][j] = 1;
                        }
                    } else {
                        if (livingNeighbours == 3) {
                            temp[i][j] = 1;
                        }
                    }
                }catch(ArrayIndexOutOfBoundsException ex){
                    int livingNeighbours = checkNeighbours(cells, i, j);
                    if (temp[i][j] == 1) {
                        if (livingNeighbours < 2 || livingNeighbours > 3) {
                            temp[i][j] = 0;
                        } else {
                            temp[i][j] = 1;
                        }
                    } else {
                        if (livingNeighbours == 3) {
                            temp[i][j] = 1;
                        }
                    }
                }
            }
        }
        cells = temp;
        return crop(cells);
    }

    public static int[][] grows(int[][] cells){
        int[][] grow = new int[cells.length + 2][cells[0].length + 2];

        for(int i = 1; i <= cells.length; i++){
            System.arraycopy(cells[i - 1], 0, grow[i], 1, cells[0].length);
        }
        return grow;
    }
    public static int[][] crop(int[][] cells){
        int iFirst = -1;
        int iLast = 0;
        int jFirst = -1;
        int jLast = 0;

        for(int i = 0; i < cells.length; i++){
            int sum = 0;
            for(int j = 0; j < cells[0].length;j++){
                sum += cells[i][j];
            }
            if(sum != 0){
                if(iFirst == -1){
                    iFirst= i;
                }
                iLast = i + 1;
            }
        }

        for(int j = 0; j < cells[0].length; j++){
            int sum = 0;
            for(int i = 0; i < cells.length; i++){
                sum += cells[i][j];
            }
            if(sum != 0){
                if(jFirst == -1){
                    jFirst = j;
                }
                jLast = j + 1;
            }
        }

        int iSize = iLast - iFirst;
        int jSize = jLast - jFirst;

        int[][] newOne = new int[iSize][jSize];

        for(int i = iFirst; i < iLast;i++){
            System.arraycopy(cells[i], jFirst, newOne[i - iFirst], 0, jSize);
        }
        return newOne;

    }


}
