package com.example.student4.mulduleSubjects.Service;
import com.example.student4.mulduleSubjects.Model.Subject;


import java.util.List;
import java.util.Optional;

public interface SubjectService {
    //get all subject
    List<Subject> getAllSubject();

    //get subject by id
    Optional<Subject> getSubjectById(long id);

    void addSubject(Subject subject);

    void updateSubject(long id, Subject subject);

    void deleteSubject(long id);

    Optional<Subject> getSubjectByName(String name);

    List<Subject> getSubjectBySem(int duration);

    List<Subject> orderBy();

    int sumSubject();

    int sumSubjectBySem(long duration);
}
