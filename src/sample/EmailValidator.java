package sample;

public class EmailValidator {
    private static Integer atCounter = 0;
    private static boolean alpha;
    private static boolean wrongAlpha;




    public static boolean isValid(String userEmail) {
        for (int i=0; i < userEmail.length(); i++){
            char c = userEmail.charAt(i);
            if (((c >= 'a')&&(c <= 'z'))||((c >= 'A')&&(c <= 'Z'))||((c >= '0')&&(c <= '9'))||(c == '@')||(c == '_')||(c == '.')||(c == '-')) {
                alpha = true;
            }else{
                wrongAlpha = true;
            }
            if (c == '@') {
                atCounter++;
            }
        }
        return alpha && !wrongAlpha && atCounter==1;
    }

}