package com.example.student4.ModuleMark.Controller;

import com.example.student4.ModuleMark.Model.Marks;
import com.example.student4.ModuleMark.Service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/marks")
public class MarksAPI {
    @Autowired
    MarksService marksService;

    @GetMapping(path = "")
    List<Marks> getAllList(){
        return marksService.getALlMarks();
    }
}
