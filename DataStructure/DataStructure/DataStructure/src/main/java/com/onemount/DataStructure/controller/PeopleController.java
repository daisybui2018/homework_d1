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

    @GetMapping("groupbynationalitythencount")
    public ResponseEntity<Map<String, Long>> groupByNationalityThenCount() {
        return ResponseEntity.ok().body(personRepo.countByNationality());
    }

    @GetMapping("getPersonOver25")
    public ResponseEntity<List<Person>> getPersonOver25() {
        return ResponseEntity.ok().body(personRepo.getPersonOver25());
    }

    @GetMapping("averageAgePerNationality")
    public ResponseEntity<Map<String, Double>> averageAgePerNationality() {
        return ResponseEntity.ok().body(personRepo.averageAgePerNationality());
    }

    @GetMapping("addEvaluation")
    public ResponseEntity<List<Person>> addEvaluation(){
        return ResponseEntity.ok().body(personRepo.addEvaluation());
    }
}
