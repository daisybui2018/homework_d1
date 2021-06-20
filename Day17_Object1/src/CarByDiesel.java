public class CarByDiesel extends GeneralCar implements Car{
    public CarByDiesel(String name, String brand, int year, double price) {
        super(name, brand, year, price);
    }

    @Override
    public void set4Circle(){
        System.out.println("Cứ là xe oto chạy bằng Diesel thì bánh có kích thứơc xDiesel");
    }
    @Override
    public void setHowToStart() {
        System.out.println("Cứ là xe oto chạy bằng Diesel thì đều khởi động như method này định nghĩa.");
    }

    @Override
    public void setHowToBrakingSystem() {
        System.out.println("Cứ là xe oto chạy bằng Diesel thì đều dừng xe như method này định nghĩa.");
    }

    @Override
    public void setHowToSpeedUp() {
        System.out.println("Cứ là xe oto chạy bằng Diesel thì đều tăng tốc như method này định nghĩa.");
    }

    @Override
    public void setHowToSlowdown() {
        System.out.println("Cứ là xe oto chạy bằng Diesel thì đều phanh như method này định nghĩa.");
    }

    @Override
    public void setHowToCleanGlass() {
        System.out.println("Cứ là xe oto chạy bằng Diesel thì đều rửa xe như method này định nghĩa.");
    }

    public void dieseMethod(){
        System.out.println("Chỉ có xe Vinfast chạy bằng Diesel có method khác biệt này");
    }
}
