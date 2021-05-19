import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,i,j,temp,min,max;
        int a[],b[];
        System.out.println("Mời bạn nhập số phần tử của mảng: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        a = new int[n];
        for(i=0;i<n;i++){
            System.out.println("Nhập phần tử thứ "+ (i+1)+": ");
            a[i] = scan.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập: ");
        for (i=0;i<n;i++){
            System.out.printf("%d\t",a[i]);
        }
        System.out.printf("\n");
        b = a.clone();
        //Sắp xếp mảng b theo thứ tự tăng dần
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n;j++){
                if(b[i] > b[j]){
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
         //Tìm phần tử lớn nhất và index của phần tử đó
        for(i=0;i<n;i++){
            if(a[i] == b[n-1]){
                System.out.println("Phần tử lớn nhất là "+a[i]+" nằm ở vị trí số "+(i+1));
            }
        }
        //Tìm phần tử lớn thứ 2 và index của phần tử đó
        for(i=0;i<n;i++){
            if(a[i] == b[n-2]){
                System.out.println("Phần tử lớn thứ 2 là "+a[i]+" nằm ở vị trí số "+(i+1));
            }
        }
        //Tìm phần tử lớn nhất và index của phần tử đó
        for(i=0;i<n;i++){
            if(a[i] == b[0]){
                System.out.println("Phần tử nhỏ nhất là "+a[i]+" nằm ở vị trí số "+(i+1));
            }
        }
    }
}
