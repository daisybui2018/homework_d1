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
    public ResponseEntity<List<Person>> getAll() {
        return ResponseEntity.ok().body(personRepo.getAll());
    }

    @GetMapping("countDevInSomeCity")
    public ResponseEntity<Map<String, List<Person>>> countDevInSomeCity() {
        return ResponseEntity.ok().body(personRepo.countDevInSomeCity());
    }

    @GetMapping("devhanoisaigoshanghai")
    public ResponseEntity<String> devhanoisaigoshanghai() {
        Map<String, List<Person>> devInSomeCity = this.personRepo.countDevInSomeCity();
        StringBuilder res = new StringBuilder();
        for(String key : devInSomeCity.keySet()) {
            res = res.append("- ".concat(key).concat(": \n"));
            for (Person person: devInSomeCity.get(key)) {
                res = res.append("<p>- {\"name\":"
                        .concat(person.getName()).concat("\",")
                        .concat("\"email\":").concat(person.getEmail()).concat("\",")
                        .concat("\"job\":").concat(person.getJob()).concat("\",")
                        .concat("\"gender\":").concat(person.getGender()).concat("\",")
                        .concat("\"city\":").concat(person.getCity()).concat("\",")
                        .concat("\"salary\":").concat(String.valueOf(person.getSalary())).concat("\",")
                        .concat("\"birthdate\":").concat(person.getBirthdate().toString())
                        .concat("} \n</p>"));
            };
        }
        return ResponseEntity.ok().body(res.toString());
    }
    @GetMapping("youngestdevs")
    public ResponseEntity<Map.Entry<String, Double>> youngestdevs() {
        return ResponseEntity.ok().body(personRepo.youngestdevs());
    }
    @GetMapping("malefemaleratio")
    public ResponseEntity<Map<String, Double>> malefemaleratio() {
        return ResponseEntity.ok().body(personRepo.malefemaleratio());
    }
    @GetMapping("avgsalarypeopleabove30")
    public ResponseEntity<Double> avgsalarypeopleabove30() {
        return ResponseEntity.ok().body(personRepo.avgsalarypeopleabove30());
    }
}
