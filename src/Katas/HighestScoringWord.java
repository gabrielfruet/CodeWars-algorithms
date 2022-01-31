package Katas;

public class HighestScoringWord {

    public static String high(String s) {

        String[] words = s.split(" ");
        int[] pointsPerWord = new int[words.length];

        int indexOfHighest = 0;

        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                pointsPerWord[i] += words[i].charAt(j) - 'a' + 1;
            }
            if(pointsPerWord[i] > pointsPerWord[indexOfHighest] && i != 0){
                indexOfHighest = i;
            }
        }
        return words[indexOfHighest];
    }

}
