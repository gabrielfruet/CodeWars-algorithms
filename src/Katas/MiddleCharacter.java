package Katas;

public class MiddleCharacter {
    public static String getMiddle(String word) {
        int index;
        index = word.length()/2;
        if(word.length() % 2 == 0){
            return word.subSequence(index - 1, index + 1).toString();
        }
        else{
            return word.subSequence(index, index + 1).toString();
        }
    }
}
