import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        bai2();
    }
    static void bai2(){
        //Loại bỏ các ký tự giống nhau trong 1 chuỗi aabbccd => abcd
        String s = "";
        String s1 = "";
        int i,j,temp=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự: ");
        s = scan.nextLine();
        int length = s.length();
        Boolean[] arrCheck = new Boolean[length];
        char[] arrChar = new char[length];
        for(i=0;i<length;i++){
            arrCheck[i] = false;
        }
        for(i=0;i<length-1;i++){
            for(j=i+1;j<length;j++){
                if(s.charAt(i) == s.charAt(j)){
                    arrCheck[j]= true;
                }
            }
        }
        for(i=0;i<length;i++){
            if(!arrCheck[i]){
                s1 = s1.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.printf("Chuỗi sau khi đã loại bỏ ký tự trùng: %s",s1);
        System.out.println();
    }
}
