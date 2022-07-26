package com.example.student4.mulduleSubjects.Controller;

import com.example.student4.mulduleSubjects.Model.Subject;
import com.example.student4.mulduleSubjects.Service.SubjectService;
import com.example.student4.mulduleSubjects.Service.SubjectServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/subject")
public class SubjectAPI {
    @Autowired
    SubjectService subjectService = new SubjectServiceImplement();

    //get all subject
    @GetMapping(path = "/")
    List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    };

    //get subject by id
    @GetMapping(path = "{id}")
    Optional<Subject> getSubjectById(@PathVariable  long id){
        return subjectService.getSubjectById(id);
    };

    @PostMapping(path = "")
    void addSubject(@RequestBody  Subject subject){
        subjectService.addSubject(subject);
    };

    @PutMapping(path = "{id}")
    void updateSubject(@PathVariable long id,@RequestBody Subject subject) {
        subjectService.updateSubject(id, subject);
    };

    @DeleteMapping(path = "{id}")
    void deleteSubject(@PathVariable long id) {
        subjectService.deleteSubject(id);
    };

    @GetMapping(path = "{name}")
    Optional<Subject> getSubjectByName(@PathVariable String name){
        return subjectService.getSubjectByName(name);
    };

    @GetMapping(path = "{duration}")
    List<Subject> getSubjectBySem(@PathVariable int duration){
        return subjectService.getSubjectBySem(duration);
    };

//    @GetMapping()
//    List<Subject> orderBy();

    @GetMapping(path = "/sumSubject")
    int sumSubject() {
        return subjectService.sumSubject();
    };

    @GetMapping(path = "/sumSubject/{duration}")
    int sumSubjectBySem(@PathVariable  long duration){
        return subjectService.sumSubjectBySem(duration);
    };
}
