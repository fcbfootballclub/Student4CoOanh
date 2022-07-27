package com.example.student4.ModuleMark.Controller;

import com.example.student4.ModuleMark.Model.Marks;
import com.example.student4.ModuleMark.Service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/marks")
public class MarksAPI {
    @Autowired
    MarksService marksService;

    @GetMapping(path = "")
    List<Marks> getAllList(){
        return marksService.getALlMarks();
    }

    @GetMapping(path = "{id}")
    Optional<Marks> getMarkById(@PathVariable long id){
        return marksService.getMarksById(id);
    }

    @PostMapping(path = "")
    void addMark(@RequestBody Marks marks){
        marksService.addMarks(marks);
    }

    @PutMapping(path = "{id}")
    void updateMark(@PathVariable long id, @RequestBody Marks marks){
        marksService.updateMarks(id, marks);
    }


}
