package com.example.student4.ModuleMark.Service;

import com.example.student4.ModuleMark.Model.Marks;

import java.util.List;
import java.util.Optional;

public interface MarksService {
        List<Marks> getALlMarks();

        Optional<Marks> getMarksById(long id);

        void addMarks(Marks marks);

        void updateMarks(long id, Marks marks);

        void delete(long id);
}
