public class Calculator {
    int a = 10;
    int b = 30;
    void sum(){
        int c;
        c = a+b;
        System.out.println("Tổng: "+c);
    }
    void Minus(int a, int b){
        int c;
        c = a-b;
        System.out.println("Hiệu: "+c);
    }
    double divide (double a, int b){
        double d;
        d = a/b;
        return d;
    }
}
