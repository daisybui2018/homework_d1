import org.w3c.dom.ls.LSOutput;
import java.util.*;
import java.util.stream.Collectors;

public class ExerCollection {
    private ArrayList<Person> people = new ArrayList<Person>(List.of(
            new Person("Vinh", "Vietnam", 28),
            new Person("Lan", "Vietnam", 24),
            new Person("John", "USA", 27),
            new Person("Lee", "China", 67),
            new Person("Kim", "Korea", 22),
            new Person("Long", "Vietnam", 18),
            new Person("Jungho", "Korea", 19),
            new Person("Tian", "China", 20),
            new Person("Clara", "USA", 40),
            new Person("Mikura", "Japan", 27),
            new Person("Sony", "Japan", 29),
            new Person("Xiang", "China", 78),
            new Person("Peter", "France", 18),
            new Person("Haloy", "Malaysia", 20),
            new Person("Magie", "Malaysia", 32)
            ));
//1.1 Đếm số người theo từng quốc tịch in ra màn hình
//    - China: 4
//    - Japan: 2
//    - Korea: 2
//    - USA: 2
//    - Vietnam: 3
    public void Bai1()
    {
        Map<String,Integer> countPeopleByNationality = new HashMap<>();
        people.stream().forEach(person -> {
            Integer count = countPeopleByNationality.get(person.getNationality());
            if (count == null){
                countPeopleByNationality.put(person.getNationality(),1);
            }else {
                countPeopleByNationality.put(person.getNationality(),count+1);
            }
        });
       countPeopleByNationality.entrySet().stream().forEach(result ->{
           System.out.printf("\n- %s"+": %d",result.getKey(), result.getValue());
       });
    }
//1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
//   - Vinh - Vietnam - 28
//   - John - USA - 27
//   ...
    public void Bai2()
    {
        ArrayList<Person> people25 = new ArrayList<>(List.of());
        people.stream().forEach(person -> {
            if (person.getAge() > 25){
                people25.add(person);
            }
        });
        people25.sort(Comparator.comparing(Person::getAge).reversed());
        people25.stream().forEach(person25 ->{
            System.out.printf("\n- %s - %s - %d",person25.getName(), person25.getNationality(), person25.getAge());
        });
    }
//1.3 Tính trung bình tuổi của người theo từng quốc gia
//    - China: 36.7
//    - Japan: 29.3
//    - Korea: 25.5
//    - USA: 22.5
//    - Vietnam: 27.3
    //China-4-100
    public void Bai3(){
        Map<String,List<Person>> averAge = new HashMap<>();
        averAge = people.stream().collect(Collectors.groupingBy(Person::getNationality));
        averAge.entrySet().forEach(nationality -> {
            int sumAge = 0;
            for (Person person : nationality.getValue()) {
                sumAge += person.getAge();
            }
            double averAgeD = (double) sumAge/(nationality.getValue().size());
            System.out.printf("\n- %s: %.1f", nationality.getKey(), averAgeD);
        });
    }
//1.4 In ra màn hình đánh giá tuổi mỗi người
//     < 20 tuổi: nổi loạn
//     20 đến 30 tuổi: việc làm
//     31 đến 40 tuổi: sự nghiệp
//     41 trở lên: hưởng thụ
    public void Bai4(){
        people.stream().forEach(person -> {
            String strDanhGia = "";
            if(person.getAge() < 20)
                strDanhGia ="nổi loạn";
            else if(person.getAge() >= 20 && person.getAge()<= 30)
                strDanhGia ="việc làm";
            else if(person.getAge()>= 31 && person.getAge() <= 40 )
                strDanhGia ="sự nghiệp";
            else
                strDanhGia ="hưởng thụ";
            System.out.printf("\n- %s"+" - %s"+" - %d"+" - %s",person.getName(), person.getNationality(), person.getAge(), strDanhGia);
        });
    }
}
