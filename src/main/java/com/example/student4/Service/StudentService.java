package com.example.student4.Service;

import com.example.student4.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAll();
    Optional<Student> getStudentById(long id);
    void addStudent(Student student);
    void updateStudent (long id, Student student);
    void deleteStudent(long id);

    Optional<Student> getStudentByEmail(String email);
}
