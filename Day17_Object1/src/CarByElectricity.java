public class CarByElectricity extends GeneralCar implements Car {
    public CarByElectricity(String name, String brand, int year, double price) {
        super(name, brand, year, price);
    }

    @Override
    public void set4Circle(){
        System.out.println("Cứ là xe oto chạy bằng Electricity thì bánh có kích thứơc xElectricity");
    }
    @Override
    public void setHowToStart() {
        System.out.println("Cứ là xe oto chạy bằng Electricity thì đều khởi động như method này định nghĩa.");
    }

    @Override
    public void setHowToBrakingSystem() {
        System.out.println("Cứ là xe oto chạy bằng Electricity thì đều dừng xe như method này định nghĩa.");
    }

    @Override
    public void setHowToSpeedUp() {
        System.out.println("Cứ là xe oto chạy bằng Electricity thì đều tăng tốc như method này định nghĩa.");
    }

    @Override
    public void setHowToSlowdown() {
        System.out.println("Cứ là xe oto chạy bằng Electricity thì đều phanh như method này định nghĩa.");
    }

    @Override
    public void setHowToCleanGlass() {
        System.out.println("Cứ là xe oto chạy bằng Electricity thì đều rửa xe như method này định nghĩa.");
    }

    public void electricityMethod(){
        System.out.println("Chỉ có xe Vinfast chạy bằng Electricity có method khác biệt này");
    }
}
