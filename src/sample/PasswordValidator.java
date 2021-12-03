package sample;

public class PasswordValidator {
    private static boolean alpha;
    private static boolean numeric;
    private static boolean special;
    private static boolean len;




    public static boolean isValid(String userPassword) {

        for (int i = 0; i < userPassword.length(); i++) {
            char c = userPassword.charAt(i);
            if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'))) {
                alpha = true;
                break;
            }
        }
        for (int i = 0; i < userPassword.length(); i++) {
            char c = userPassword.charAt(i);
            if (((c >= '0') && (c <= '9'))) {
                numeric = true;
                break;
            }
        }
        for (int i = 0; i < userPassword.length(); i++) {
            char c = userPassword.charAt(i);
            if (((c == '*') || (c == '^')|| (c == '&')|| (c == '@')|| (c == '!'))) {
                special = true;
                break;
            }
        }

        if (userPassword.length() >= 7){
            len = true;
        }


        if (alpha&&numeric&&special&&len){
            return true;
        }else{
            return false;
        }
    }

}
