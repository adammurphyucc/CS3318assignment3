package sample;

public class PasswordValidator {
    public static boolean len;
    public static boolean alpha;



    public static boolean isValid(String userPassword) {
        if(userPassword.length() >= 7){
            len = true;
        }
        for (int i = 0; i < userPassword.length(); i++) {
            char c = userPassword.charAt(i);
            if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'))) {
                alpha = true;
                break;
            }
        }

        return len && alpha;
    }

}
