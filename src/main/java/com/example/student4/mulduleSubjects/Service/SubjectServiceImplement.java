package com.example.student4.mulduleSubjects.Service;

import com.example.student4.mulduleSubjects.Model.Subject;
import com.example.student4.mulduleSubjects.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectServiceImplement implements SubjectService{
    @Autowired
    SubjectRepository subjectRepository;
    @Override
    public List<Subject> getAllSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public Optional<Subject> getSubjectById(long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public void updateSubject(long id, Subject subject) {
        Optional<Subject> found = subjectRepository.findById(id);
        if(found.isPresent()){
            found.get().setName(subject.getName());
            found.get().setDescription(subject.getDescription());
            found.get().setDuration(subject.getDuration());
            subjectRepository.save(found.get());
        }
    }

    @Override
    public void deleteSubject(long id) {
        subjectRepository.deleteById(id);
    }

    @Override
    public Optional<Subject> getSubjectByName(String name) {
        return subjectRepository.findByName(name);
    }

    @Override
    public List<Subject> getSubjectBySem(int duration) {
        return subjectRepository.findAllByDuration(duration);
    }

    @Override
    public List<Subject> orderBy() {
        return null;
    }

    @Override
    public int sumSubject() {
        return subjectRepository.findAll().size();
    }

    @Override
    public int sumSubjectBySem(long duration) {
        return (int) subjectRepository.findAll().stream().filter(s -> s.getDuration() == duration).count();
    }
}
