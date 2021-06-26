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
    //1.1 Đếm số người theo từng quốc tịch in ra màn hình
    public Map<String, Long> countByNationality(){
        return people.stream()
                .collect(Collectors.groupingBy(Person::getNationality,Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
    }
    //1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
    public List<Person> getPersonOver25(){
        return people.stream().sorted(Comparator.comparing((Person::getAge)).reversed()).filter(person -> {return (person.getAge() > 25) ? true : false;}).toList();
    }
    //1.3 Tính trung bình tuổi của người theo từng quốc gia
    public Map<String, Double> averageAgePerNationality() {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getNationality, Collectors.averagingInt(Person::getAge)));
    }
    //1.4 In ra màn hình đánh giá tuổi mỗi người
    public List<Person> addEvaluation(){
        people.stream()
                .forEach(person -> {
                    if (person.getAge() <20) {
                        person.setEvaluation("Nổi loạn");
                    }
                    else if (person.getAge() >=20 && person.getAge()<=30) {
                        person.setEvaluation("Việc làm");
                    }
                    else if (person.getAge() >=31 && person.getAge()<=40) {
                        person.setEvaluation("Sự nghiệp");
                    }
                    else
                    {
                        person.setEvaluation("Hưởng thụ");
                    }
                });
        return people;
    }
}
