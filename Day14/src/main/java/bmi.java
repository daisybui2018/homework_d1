import java.util.InputMismatchException;
import java.util.Scanner;

public class bmi {
    double checkBMI() {
        double chieucao = 0, cannang = 0, chisoBMI = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cân nặng: ");
        while (true) {
            try {
                cannang = sc.nextDouble();
                if (cannang <= 0) throw new ArithmeticException();
                break;
            } catch (InputMismatchException ime) {
                ime.fillInStackTrace();
                continue;
            } catch (ArithmeticException ae) {
                System.out.println("Cân nặng phải >0");
                continue;
            }
        }
        System.out.println("Nhập chiều cao: ");
        while (true) {
            try {
                chieucao = sc.nextDouble();
                if (chieucao <= 0) throw new ArithmeticException();
                break;
            } catch (InputMismatchException ime) {
                ime.fillInStackTrace();
                continue;
            } catch (ArithmeticException ae) {
                System.out.println("Chiều cao phải >0");
                continue;
            }
        }
        chisoBMI= cannang / (chieucao * chieucao);
        System.out.println("chỉ số BMI của bạn:"+chisoBMI);
        return chisoBMI;
    }
}