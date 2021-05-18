import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int day, excercise;
        //Chọn day
        System.out.print("Mời bạn nhập ngày thực hành:");
        Scanner scan1 = new Scanner(System.in);
        day = scan1.nextInt();

        //Chọn Ex
        System.out.print("Mời bạn nhập bài tập muốn làm:");
        Scanner scan2 = new Scanner(System.in);
        excercise = scan2.nextInt();

        switch (day){
            case 6:
                switch (excercise){
                    case 4:
                        ex6_4();
                        break;
                    case 5:
                        ex6_5();
                        break;
                    case 6:
                        ex6_6();
                        break;
                    case 7:
                        ex6_7();
                        break;
                    case 8:
                        ex6_8();
                        break;
                    case 15:
                        ex6_15();
                        break;
                    default:
                        break;
                }
                break;
            case 7:
                practicesDay7();
                break;
            default:
                break;
        }
    }
//Day 6 Bài 4
//Viết chương trình tạo 1 số ngầu nhiên
//Kiểm tra số đó có là số nguyên tố không?
//Tính giai thừa của số đó
    static void ex6_4(){
        int n;
        boolean isPrime;
        Random r = new Random();
        n = r.nextInt(20);
        System.out.println("Hệ thống vừa tạo 1 số ngẫu nhiên: "+n);
        isPrime = isPrim(n);
        if (isPrime){
            System.out.println("Số "+n+" là số nguyên tố");
        }else {
            System.out.println("Số "+n+" không là số nguyên tố");
        }
        System.out.println("Giai thừa của "+n+" là: "+factorial(n));
    }
//Day6 Bài 5
//Cho chuỗi str = “You only live once, but if you do it right, once is enough”
//in ra màn hình index của tất cả ký tự ‘o’ trong chuỗi trên
    static void ex6_5(){
        int length,i;
        String str = "You only live once, but if you do it right, once is enough";
        System.out.println("Vị trí của các chứ `o` trên màn hình lần lượt là: ");
        length = str.length();
        for (i=0;i<length;i++){
            if(str.charAt(i) == 'o'){
                System.out.printf("%d \t",i);
            }
        }
    }
//Day6 Bài 6
//Viết chương trình in ra bảng cửu chương
static void ex6_6(){
    bangCuuChuong();
}
//Day6 Bai7
//Viết chương trình nhập vào 3 cạnh, kiểm tra 3 cạnh đó có là tam giác, tam giác vuông, tam giác cân,
//tam giác đều
static void ex6_7(){
        int a,b,c;
    Scanner scan = new Scanner(System.in);
    System.out.println("Mời bạn nhập 3 cạnh: ");
    a = scan.nextInt();
    b = scan.nextInt();
    c = scan.nextInt();
    checkTriangle(a,b,c);
}

//Day6 Bai8
//Nhập vào một chuỗi và đếm số từ của chuỗi đó.
//Ví dụ “Học lập trình” có 3 từ
static void ex6_8(){
     String str = new String();
     int length,i,count=0;
     Scanner scan = new Scanner(System.in);
    System.out.println("Mời bạn nhập vào 1 chuỗi: ");
     str = scan.nextLine();
     System.out.println(str);
     str = str.replaceAll("\\s\\s+", " ").trim();
     length = str.length();
     for (i=0;i<length;i++)
     {
         if (str.charAt(i) == ' '){
             count++;
         }
     }
     if (length == 0){
         System.out.println("Bạn chưa nhập chuỗi");
     }else {
         System.out.println("Số từ trong chuỗi là "+(count+1));
     }
}
//Day6 Bai15
//Cho chuỗi str = “You only live once, but if you do it right, once is enough”
//Đếm số lần ký tự ‘o’ xuất hiện trong chuỗi
static void ex6_15(){
    int length,i,count=0;
    String str = "You only live once, but if you do it right, once is enough";
    System.out.println("Vị trí của các chứ `o` trên màn hình lần lượt là: ");
    length = str.length();
    for (i=0;i<length;i++){
        if(str.charAt(i) == 'o'){
            count++;
        }
    }
    System.out.println("Chuỗi có "+count+" ký tự 'o'");
}
//Day7
static void practicesDay7()
{
    float b[];
    b = new float[5];
    b[0] = 6;
    b[1] = 3.2f;
    b[2] = 21.5f;
    b[3] = 20.5f;
    b[4] = 10;
    System.out.println("Dãy số vừa tạo là: ");
    for(int i=0;i<b.length;i++){
        System.out.printf("Phần tử thứ %d: %.2f\n",i,b[i]);
    }
}
//Kiểm tra 1 số có phải là số nguyên tố không
    static boolean isPrim(int num) {
        int i, temp;
        boolean isPrime = true;
        for (i = 2; i < num; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

//Tính giai thừa
    static long factorial(int n){
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }

//In bảng cửu chương
    static void bangCuuChuong(){
        Scanner nc=new Scanner(System.in);
        System.out.println("nhap vao so cua ban cuu chuong VD: ban cuu chuong 2 thi nhap 2:");
        System.out.println("nhap vao 1 so:");
        int i=nc.nextInt();
        int num=1;
        while(num<=10){
            System.out.printf("\n%d * "+i+" = %d",num,(num * i));
            num++;
        }
    }
//Kiểm tra là tam giác ko, và tam giác gì
static void checkTriangle(int a, int b, int c){
    if ((a + b > c) || (a + c > b) || (b + c > a)) {
        System.out.println("Đây là tam giác !");
    }
    if ((a == b) && (b == c) && (c == a)) {
        System.out.println("Đây là tam giác đều !");
    } else if((a == b) || (b == c) || (c == a)) {
        System.out.println("Đây là tam giác cân !");
    } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
        System.out.println("Đây là tam giác vuông !");
    }
}
}
