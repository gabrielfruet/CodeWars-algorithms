package Katas;

public class ValidParenthesis {
    public static boolean validParentheses(String parens)
    {
        int even = 0;
        char[] s = parens.toCharArray();

        for(char c : s){
            if(c == '(') {
                even++;
            }
            if(c == ')'){
                even--;
                if(even < 0){
                    return false;
                }
            }
        }

        return even == 0;
    }
}
