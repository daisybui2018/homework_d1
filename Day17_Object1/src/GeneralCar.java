public class GeneralCar {
    public String name;
    public String brand;
    public int year;
    public double price;

    public GeneralCar(String name, String brand, int year, double price) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "GeneralInfo{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                '}';
    }

    public void set4Circle(){
        System.out.println("Cứ là ô tô thì thiết kế 4 bánh");
    }
    public static void setStartSpeed(){
         System.out.println("Cứ là ô tô thì vận tốc khởi động mặc định là: 60km/h");
    }
}
