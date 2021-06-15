import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2 {
//Kiem tra co it nhat 1 ky tu in hoa
    public boolean checkUpperCase(String input){
        Boolean checkUppercase = false;
        int lengde = input.length();
        for(int i=0; i<lengde;i++) {
            if(Character.isUpperCase(input.charAt(i))){
                checkUppercase = true;
                break;
            }
        }
        return checkUppercase;
    }
//Kiem tra co it nhat 1 ky tu so
    public boolean checkDigit(String input){
        Boolean checkDigitv = false;
        int lengde = input.length();
        for(int i=0; i<lengde;i++) {
            if (Character.isDigit(input.charAt(i))) {
                checkDigitv = true;
                break;
            }
        }
        return checkDigitv;
    }
//Kiem ta it nhat 1 ky tu dac biet
    public boolean checkSpecial(String s) {
        if (s == null || s.trim().isEmpty()) {
            System.out.println("Chuỗi sai định dạng.");
            return false;
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m;
        m = p.matcher(s);
 // boolean checkSpecialChar = m.matches();
        boolean checkSpecialChar = m.find();
        return checkSpecialChar;
    }
//Kiểm tra có it hơn 10 ky tu
    public boolean checkLength(String s){
        if(s.length()<10) return true;
        return false;
    }
}
