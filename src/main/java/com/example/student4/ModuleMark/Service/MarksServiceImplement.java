package com.example.student4.ModuleMark.Service;

import com.example.student4.ModuleMark.Model.Marks;
import com.example.student4.ModuleMark.Repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MarksServiceImplement implements MarksService{
    @Autowired
    MarksRepository marksRepository;
    @Override
    public List<Marks> getALlMarks() {
        return marksRepository.findAll();
    }

    @Override
    public Optional<Marks> getMarksById(long id) {
        return marksRepository.findById(id);
    }

    @Override
    public void addMarks(Marks marks) {
        marksRepository.save(marks);
    }

    @Override
    public void updateMarks(long id, Marks marks) {
        Optional<Marks> found = marksRepository.findById(id);
        if(found.isPresent()){
            found.get().setMark(marks.getMark());
            found.get().setIdSubject(marks.getIdSubject());
            found.get().setNote(marks.getNote());
            marksRepository.save(found.get());
        }
    }

    @Override
    public void delete(long id) {
        marksRepository.deleteById(id);
    }
}
