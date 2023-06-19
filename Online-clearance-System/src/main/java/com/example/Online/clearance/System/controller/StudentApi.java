package com.example.Online.clearance.System.controller;



import com.example.Online.clearance.System.model.Student;
import com.example.Online.clearance.System.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
@RequestMapping("/Api/v1")
public class StudentApi {
    @Autowired
    public StudentRepo studentRepo;


    @PostMapping("/add")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        try{
            Student student1 = studentRepo.save(student);
            return  new ResponseEntity<>("arafa", HttpStatus.OK);

        }
        catch (Exception pindua) {
            return  new ResponseEntity<>("tayari",HttpStatus.BAD_REQUEST);
        }
    }

}



//    @DeleteMapping ("/{id}")
//    public ResponseEntity<?> delete(@PathVariable int id){
//        try{
//            StudentRepo.deleteById(id)
//            return  new ResponseEntity<>("Input Data", HttpStatus.OK);
//
//        }
//        catch (Exception exception) {
//            return  new ResponseEntity<>("Everything went wrong",HttpStatus.BAD_REQUEST);
//        }
//    }
//
//}




