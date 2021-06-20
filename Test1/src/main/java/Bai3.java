import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai3 {
    public void daysInMonth(int thang) {
        Calendar cal = Calendar.getInstance();
        //int nam = cal.get(Calendar.YEAR);
        Scanner scan = new Scanner(System.in);
        int nam = Integer.valueOf(scan.nextLine());
        try {
            if(thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==10)
            {
                System.out.println(String.format("Tháng %s Có 31 ngày", thang));
            }
            if(thang==4||thang==6||thang==9||thang==11)
            {
                System.out.format("Tháng %s Có 30 ngày", thang);
            }
            if(thang==2) {
                if (nam % 400 == 0 || nam % 4 == 0 && nam % 100 != 0) {
                    System.out.println(String.format("Tháng %s Có 29 ngày", thang));
                } else {
                    System.out.println(String.format("Tháng %s Có 28 ngày", thang));
                }
            }
            if(thang==13)
                throw new InputMismatchException("Tháng không được lớn hơn 12.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Đây không phải là tháng trong năm");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Đây không phải là tháng trong năm");
        }
    }
}
