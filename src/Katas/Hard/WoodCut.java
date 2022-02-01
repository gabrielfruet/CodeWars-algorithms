package Katas.Hard;

public class WoodCut {

    public static int Cutter(int[] woods, int pieces){

        if(woods.length != 3){
            throw new IllegalArgumentException("Quantidade de madeiras incompativel");
        }
        double mediumSize = woodSizeMedia(woods, pieces);
        int[] woodPieces = woodPiecesArray(woods, (int) mediumSize);
        int index = woodPieces[3];
        return woods[index]/woodPieces[index];

    }

    public static double woodSizeMedia(int[] array, int pieces){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum/pieces;
    }

    public static int[] woodPiecesArray(int[] array, int mediumSize){
        double[] piecesSize = new double[3];
        for(int i = 0; i < 3; i++){
            piecesSize[i] = array[i] / (double)mediumSize;
        }

        int[] returned = new int[4];
        int indexLargest = 0;

        for(int i = 0; i < 3; i++){
            if(piecesSize[i] % 1 > piecesSize[indexLargest] % 1){
                indexLargest = i;
            }
            returned[i] = (int) piecesSize[i];
        }
        returned[indexLargest]++;
        returned[3] = indexLargest;

        return returned;
    }

}
