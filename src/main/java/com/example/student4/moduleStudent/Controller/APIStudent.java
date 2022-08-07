package com.example.student4.moduleStudent.Controller;

import com.example.student4.moduleStudent.Model.Student;
import com.example.student4.moduleStudent.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "/")
public class APIStudent {
    @Autowired
    StudentService studentService;

    // get all students
    @GetMapping(path = "")
    List<Student> getAll() {
        return studentService.getAll();
    }

    //get student by id
    @GetMapping(path = "{id}")
    Optional<Student> getStudentByID(@PathVariable long id){
        return studentService.getStudentById(id);
    }

    //add student
    @PostMapping(path = "/")
    void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    //update
    @PutMapping(path = "{id}")
    void updateStudent(@PathVariable long id, @RequestBody Student student){
        studentService.updateStudent(id, student);
    }

    @DeleteMapping(path = "{id}")
    void delete(@PathVariable long id){
        studentService.deleteStudent(id);
    }

    //find student by email
    @GetMapping(path = "/findByEmail/{email}")
    Optional<Student> getStudentByEmail(@PathVariable(name = "email") String email){
        return studentService.getStudentByEmail(email);
    }

}
