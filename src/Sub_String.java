package String_s;

public class Sub_String {
//    Question 796.Rotate String
//    Input: s = "abcde", goal = "cdeab"
//    Output: true
    public static boolean isSub(String str , String goal){
        if (str.length() != goal.length()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            str = str.substring(0)+str.substring(0,1);
            if(str.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
