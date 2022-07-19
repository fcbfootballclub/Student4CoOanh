package com.example.student4.Service;

import com.example.student4.Model.Student;
import com.example.student4.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void updateStudent(long id, Student student) {
        Optional<Student> foundStudent = studentRepository.findById(id);
        if(foundStudent.isPresent()){
            foundStudent.get().setFullName(student.getFullName());
            foundStudent.get().setBirthDate(student.getBirthDate());
            foundStudent.get().setEmail(student.getEmail());
            studentRepository.save(foundStudent.get());
        }
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Optional<Student> getStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }

}
