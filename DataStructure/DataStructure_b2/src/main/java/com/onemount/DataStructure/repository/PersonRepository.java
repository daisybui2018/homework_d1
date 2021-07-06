package com.onemount.DataStructure.repository;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.onemount.DataStructure.model.Person;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;
import java.util.Comparator;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@Repository
public class PersonRepository {
    private List<Person> people = new ArrayList<>();
    public PersonRepository() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        File file;
        try {
            file = ResourceUtils.getFile("classpath:static/person.json");
            people.addAll(mapper.readValue(file, new TypeReference<List<Person>>(){}));
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Person> getAll() {
        return people;
    }
    //1. Trả về danh sách 'developer' ở các thành phố Hanoi, Saigon, Shanghai
    public  Map<String, List<Person>> countDevInSomeCity(){
        return people.stream()
                .filter(person -> person.getJob().equalsIgnoreCase("developer"))
              .collect(groupingBy(Person::getCity));
    }
    //2. Tìm ra thành phố có độ tuổi trung bình của lập trình viên trẻ nhất
    public Map.Entry<String, Double> youngestdevs(){
        Map<String, Double> averageAgePerCity = new HashMap<String, Double>();
        averageAgePerCity =  people.stream()
                .filter(person -> person.getJob().equalsIgnoreCase("developer"))
                .collect(Collectors.groupingBy(Person::getCity, Collectors.averagingInt(Person::getAge)));
        Map.Entry<String, Double> tmp = averageAgePerCity.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue)).get();
        return tmp;
    }
    //3. Liệt kê tỷ lệ nam/nữ ở từng thành phố
    public Map<String, Double> malefemaleratio(){
        Map<String, List<Person>> devPeople= new HashMap<String, List<Person>>();
        Double maleCount;
        Map<String, Double> maleFemaleRatio = new HashMap<String, Double>();
        devPeople = people.stream()
                .filter(person -> person.getJob().equalsIgnoreCase("developer"))
                .collect(Collectors.groupingBy(Person::getCity));
        for (Map.Entry<String, List<Person>> devP : devPeople.entrySet()) {
            maleCount = (double) devP.getValue()
                    .stream()
                    .filter(person -> person.getGender().equalsIgnoreCase("Male"))
                    .count();
            maleFemaleRatio.put(devP.getKey(),maleCount/(devP.getValue().size() - maleCount));
        }
        return maleFemaleRatio;
    }
    //4. Tính mức lương trung bình của tất cả những người trên 30 tuổi
    public Double avgsalarypeopleabove30(){
        Double avgsalaryabove30 = people.stream()
                    .filter(person -> person.getAge() > 30)
                    .collect(Collectors.averagingDouble(Person::getSalary));
        return avgsalaryabove30;
    }
}
