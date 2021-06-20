import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class main {
    public static void main(String[] args) {
////Bai 1
//        System.out.println("##### BAI 1 #####");
//        String s = "You Only Live Once. But if You do it right. once is Enough";
//        Bai1 b1 = new Bai1();
//        int count = b1.demTu(s);
//        System.out.println("Chuỗi ban đầu:" + s);
//        System.out.println("Tổng số ký tự tự viết hoa là: " + count);
//        System.out.println("--------");
//        b1.convertUpperCase(s);
//        System.out.println("--------");
//        System.out.println("Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, còn các chữ khác viết thường:");
//        System.out.println(b1.ChuanHoa(s));
////Bài 2
//        System.out.println("##### BAI 2 #####");
//        Scanner password = new Scanner(System.in);
//        System.out.println("Nhập password: ");
//        String input= password.nextLine();
//        Bai2 b2 = new Bai2();
//        if (b2.checkLength(input)){
//            System.out.println("Mật khẩu yếu.");
//        }
//        if((b2.checkDigit(input)==false) || (b2.checkSpecial(input)==false) || (b2.checkUpperCase(input)==false)){
//            System.out.println("Mật khẩu chưa đủ mạnh");
//        }
//    }
////Bài 3
//        Bai3 b3 = new Bai3();
//        b3.daysInMonth(2);


//        ArrayList<String> animal = new ArrayList<String>();
//        animal.add("Cat");
//        animal.add("Dog");
//        System.out.println(animal);

//        ArrayList<Employee> employee = new ArrayList<Employee>();
//        Employee e = new Employee(1,"Cúc");
//        employee.add(e);
//        for (Employee emp:employee){
//            System.out.println(emp.toString());
//        }


//        Quản lý danh sách sản phẩm bao gồm có mã sản phẩm, tên sản phẩm, số lượng , giá bán.
//                Tiến hành thêm thông tin sản phẩm , tìm kiêm sản phẩm theo tên, sửa sản phẩm, xoá sản phẩm

        ArrayList<Product> productList = new ArrayList<Product>();
        Product p1 = new Product("cosy001","Cosy",4,100000);
        productList.add(p1);
        for(int i =0; i< productList.size();i++){
            if(productList.get(i).name.contains("cosy")){
                System.out.println(productList.get(i));
                //productList.get(i).name = "Hoang";
            }
        }
    }
}