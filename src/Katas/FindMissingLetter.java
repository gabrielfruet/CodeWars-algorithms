package Katas;

public class FindMissingLetter {

    public static char findMissingLetter(char[] array)
    {
        for(char i = 0; i < array.length; i++){
            if(array[i] != array[0] + i){
                return (char) (array[0] + i);
            }
        }
        return ' ';
    }

}
