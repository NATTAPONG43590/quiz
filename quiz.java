import java.util.*;

public class quiz {
    public static void main(String[] args) {
        Boolean isFirstCurrect = false;
        Boolean isSecoundCurrect = false;
        Scanner kb = new Scanner(System.in);
        String x = kb.nextLine();

        final char[] firstChar = { 'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K' };
        final char[] secoundChar = { 'C', 'D', 'H', 'S' };
        if (x.length() == 2) {
            for (int i = 0; i < x.length(); i++) {
                char seperated = x.charAt(i);
                if (i == 0) {
                    for (int j = 0; j < firstChar.length; j++) {
                        if (seperated == firstChar[j]) {
                            isFirstCurrect = true;
                            break;
                        }
                    }
                }
                if (i == 1) {
                    for (int j = 0; j < secoundChar.length; j++) {
                        if (seperated == secoundChar[j]) {
                            isSecoundCurrect = true;
                            break;
                        }
                    }
                }
            }
            if (isFirstCurrect && isSecoundCurrect) {
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        } else {
            return;
        }
    }
}
