import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //bai9();
        bai10();
    }
    static void bai10(){
        int height, width;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("height: ");
            height = scan.nextInt();
        }while (height<=0);
        do {
            System.out.println("width: ");
            width = scan.nextInt();
        }while (width<=0);
        for (int i =1;i<=height;i++){
            for (int j=1;j<=2*width;j++){
                if(j%2==0){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void bai9(){
        int n, row, col, temp,j,center;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập số nguyên dương n: ");
            n = scan.nextInt();
        }while (n<=0);
        char[][] triangle = new char[n][4*n-2];
        center = 2*n-2;
        col=4*n-2;
        for(row=0;row<n;row++){
            for(col=0;col<4*n-3;col++){
                triangle[row][col] = ' ';
                temp = center - (2*(row+1)-2);
                for(j=0;j<=2*(row+1)-2;j++){
                    triangle[row][temp] = '*';
                    temp = temp+2;
                }
            }
        }
        inMatrix(triangle,row,col);
    }
    static void inMatrix(char matrix[][], int row, int col){
        int i,j;
        for (i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.printf("%c",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
