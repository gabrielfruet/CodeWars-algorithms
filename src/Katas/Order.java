package Katas;

public class Order {

    public static String order(String words) {
        String[] wordsSplitted = words.split(" ");

        if(words == ""){
            return "";
        }

        for(int j = 0; j < wordsSplitted.length; j++){
            System.out.println(wordsSplitted[j]);
        }

        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < wordsSplitted.length; i++){
            for(int j = 0; j < wordsSplitted.length; j++){
                if(wordsSplitted[j].contains(Integer.toString(i + 1))){
                    builder.append(wordsSplitted[j]);
                    builder.append(" ");
                    break;
                }
            }
        }
        builder.deleteCharAt(builder.length() - 1);

        return builder.toString();

    }

}
