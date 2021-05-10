public class Circle {
    float r=8;
    void perimeter(){
        float perimeter;
        perimeter = (float) (r*2*3.14);
        System.out.println("Chu vi hình tròn: "+perimeter+" cm");
    }
    void area(){
        float area;
        area = (float) (r*r*3.14);
        System.out.println("Diện tích hình tròn: "+area+" cm2");
    }
}
