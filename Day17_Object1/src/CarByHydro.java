public class CarByHydro extends GeneralCar implements Car,CarDriveAuto{
    public CarByHydro(String name, String brand, int year, double price) {
        super(name, brand, year, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void set4Circle(){
        System.out.println("Cứ là xe oto chạy bằng Hydro thì bánh có kích thứơc xHydro");
    }
    @Override
    public void setHowToStart() {
        System.out.println("Cứ là xe oto chạy bằng Hydro thì đều khởi động như method này định nghĩa.");
    }

    @Override
    public void setHowToBrakingSystem() {
        System.out.println("Cứ là xe oto chạy bằng Hydro thì đều dừng xe như method này định nghĩa.");
    }

    @Override
    public void setHowToSpeedUp() {
        System.out.println("Cứ là xe oto chạy bằng Hydro thì đều tăng tốc như method này định nghĩa.");
    }

    @Override
    public void setHowToSlowdown() {
        System.out.println("Cứ là xe oto chạy bằng Hydro thì đều phanh như method này định nghĩa.");
    }

    @Override
    public void setHowToCleanGlass() {
        System.out.println("Cứ là xe oto chạy bằng Hydro thì đều rửa xe như method này định nghĩa.");
    }

    @Override
    public void setHowToDriveLongWay() {
        System.out.println("Cứ là xe oto chạy bằng Hydro và lái tự động thì đều có cách lái xe đường dài như method này định nghĩa.");
    }

    @Override
    public void setHowToDriveOverMountain() {
        System.out.println("Cứ là xe oto chạy bằng Hydro và lái tự động thì đều có cách lái xe leo núi như method này định nghĩa.");
    }

    @Override
    public void setHowToDriveTropicalFog() {
        System.out.println("Cứ là xe oto chạy bằng Hydro và lái tự động thì đều có cách lái xe qua sương mù như method này định nghĩa.");
    }

    @Override
    public void setHowToDriveCrowdedArea() {
        System.out.println("Cứ là xe oto chạy bằng Hydro và lái tự động thì đều có cách lái xe qua khu vực đông dân cư như method này định nghĩa.");
    }

    public void autoCleanInterior(){
        System.out.println("Chỉ có xe Vinfast chạy bằng Hydro có method lau dọn nội thất này");
    }
}
