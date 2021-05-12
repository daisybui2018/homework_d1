public class Bai3 {
     static void checkTriangle(double a, double b, double c){
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            System.out.println("Đây là tam giác !");
        }
        if ((a == b) || (b == c) || (c == a)) {
            System.out.println("Đây là tam giác cân !");
        } else if ((a == b) && (b == c) && (c == a)) {
            System.out.println("Đây là tam giác đều !");
        } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
            System.out.println("Đây là tam giác vuông !");
        }
    }
}
