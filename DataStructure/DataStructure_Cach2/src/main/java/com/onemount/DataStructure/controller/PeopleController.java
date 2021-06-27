package com.onemount.DataStructure.controller;

import com.onemount.DataStructure.model.Person;
import com.onemount.DataStructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class PeopleController {
    @Autowired
    private PersonRepository personRepo;

    @GetMapping("getAll")
    public ResponseEntity<List<Person>> getAll(){
        return ResponseEntity.ok().body(personRepo.getAll());
    }
    //1.1 Đếm số người theo từng quốc tịch in ra màn hình
    @GetMapping("groupbynationalitythencount")
    public ResponseEntity<Map<String, Long>> groupByNationalityThenCount() {
        return ResponseEntity.ok().body(personRepo.countByNationality());
    }
    //1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình
    @GetMapping("getPersonOver25")
    public ResponseEntity<List<Person>> getPersonOver25() {
        return ResponseEntity.ok().body(personRepo.getPersonOver25());
    }
    //1.3 Tính trung bình tuổi của người theo từng quốc gia
    @GetMapping("averageAgePerNationality")
    public ResponseEntity<Map<String, Double>> averageAgePerNationality() {
        return ResponseEntity.ok().body(personRepo.averageAgePerNationality());
    }
    //1.4 In ra màn hình đánh giá tuổi mỗi người
    @GetMapping("addEvaluation")
    public ResponseEntity<List<Person>> addEvaluation(){
        return ResponseEntity.ok().body(personRepo.addEvaluation());
    }
}
