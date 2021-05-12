import java.util.Scanner;

/**
 * Giải phương trình bậc 2
 */
public class main {
    public static void main(String[] args) {
//Bài 1:
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("Tháng vừa nhập: " + month);
        Bai1.dateInMonth(month);
//Bài 2:
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        Bai2 b2 = new Bai2();
        b2.giaiPTBac2(a, b, c);
//Bài 3
        System.out.print("Nhập x = ");
        float x = scanner.nextFloat();
        System.out.print("Nhập y = ");
        float y = scanner.nextFloat();
        System.out.print("Nhập g = ");
        float g = scanner.nextFloat();
        Bai3.checkTriangle(x, y, g);
    }
}


