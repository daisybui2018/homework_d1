public class main {
//1. Mô phỏng các class về xe ô tô.
//Chúng ta có xe ô tô chạy xăng, ô tô động cơ diesel, ô động cơ điện, ô tô chạy khí Hydro.
// Ô tô người lái, ô tô tự lái.
//Hãy xây dựng hệ class, interface mô tả chi tiết nhất có thể các sản phẩm ô tô của Vinfast

public static void main(String[] args) {
    CarByHydro cHydro = new CarByHydro("HydroStrong","Vinfast",2015,700000000);
    System.out.println(cHydro.toString());
    //Tinh nang xe oto nao cung co
    cHydro.setHowToStart();

    //Tinh nang lam cho rieng xe chay bang Hydro nhung ke thua tu lop Car chung
    cHydro.set4Circle();

    //Tinh nang mà chỉ có ở lớp CarByHydro có
    cHydro.autoCleanInterior();

    //Tinh nang xe oto chung (nguoi lai)
    cHydro.setHowToBrakingSystem();

    //Tinh nang của xe tu dong lai
    cHydro.setHowToDriveTropicalFog();
}
}
