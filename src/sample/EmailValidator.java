package sample;

public class EmailValidator {

    private static Integer atCounter = 0;
    private static boolean alpha;
    private static boolean wrongAlpha;
    private static boolean period;
    private static boolean domain;
    private static boolean prefix;
    private static boolean hostCheck;



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
        String afterAt = userEmail.substring(userEmail.lastIndexOf("@")+1);
        for (int i=0; i < afterAt.length(); i++) {
            char c = afterAt.charAt(i);
            if (c == '.') {
                period = true;
                break;
            }
        }
        String afterPeriod = afterAt.substring(afterAt.lastIndexOf(".")+1);
        if (afterPeriod.length() >= 2){
            domain = true;
        }
        String[] splitEmail = userEmail.split("@");
        if(splitEmail[0].length() > 0){
            prefix = true;
        }
        String host = splitEmail[1].substring(splitEmail[1].indexOf("@") + 1, splitEmail[1].indexOf("."));
        if (host.length() > 0){
            hostCheck = true;
        }
        return hostCheck && prefix && domain && alpha && period && atCounter == 1 && !wrongAlpha;
    }

}
