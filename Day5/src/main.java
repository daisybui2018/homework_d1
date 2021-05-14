import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        nPrim();
        Prim_100();
    }
    static void nPrim(){
        int num,i=1,count=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Mời bạn nhập 1 số nguyên: ");
        num = scan.nextInt();
        do{
            boolean isPrime = false;
            isPrime = isPrim(i);
            if (isPrime){
                System.out.print(i + "\t");
                count++;
            }
            i++;
        }while(count<=num);
        System.out.print("\n");
    }
    static void Prim_100(){
        int i;
        boolean isPrime;
        for (i=1;i<100;i++){
            isPrime = isPrim(i);
            if (isPrime){
                System.out.print(i + "\t");
            }
        }
    }
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
}
