package com.example.student4.mulduleSubjects.Controller;

import com.example.student4.mulduleSubjects.Model.Subject;
import com.example.student4.mulduleSubjects.Service.SubjectService;
import com.example.student4.mulduleSubjects.Service.SubjectServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/subject")
public class SubjectAPI {
    @Autowired
    SubjectService subjectService;

    //get all subject
    @GetMapping(path = "/")
    List<Subject> getAllSubject(){
        return subjectService.getAllSubject();
    };

    //get subject by id
    @GetMapping(path = "{id}")
    Optional<Subject> getSubjectById(@PathVariable long id){
        return subjectService.getSubjectById(id);
    };

    @PostMapping(path = "")
    void addSubject(@RequestBody Subject subject){
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

    @GetMapping(path = "/findByName/{name}")
    Optional<Subject> getSubjectByName(@PathVariable String name){
        return subjectService.getSubjectByName(name);
    };

    @GetMapping(path = "/duration/{duration}")
    List<Subject> getSubjectBySem(@PathVariable int duration){
        return subjectService.getSubjectBySem(duration);
    };

    @GetMapping(path = "/sort")
    List<Subject> orderBy(@RequestParam(value = "field") String field, @RequestParam(value = "direction") String direction){
        if(field.equals("field") && direction.equals("az")){
            return subjectService.getAllSubject().stream().sorted((s1, s2) -> s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
        }
        return null;
    };

    @GetMapping(path = "/sumSubject")
    int sumSubject() {
        return subjectService.sumSubject();
    };

    @GetMapping(path = "/sumSubject/{duration}")
    int sumSubjectBySem(@PathVariable  long duration){
        return subjectService.sumSubjectBySem(duration);
    };
}
