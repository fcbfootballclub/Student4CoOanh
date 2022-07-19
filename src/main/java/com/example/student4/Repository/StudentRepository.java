package com.example.student4.Repository;

import com.example.student4.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public void findStudentByBirthDateAfterAndEmailEquals(String birthDate, String email);
    Optional<Student> findStudentByEmail(String email);
    Optional<Student> findStudentByFullNameAndEmail(String name, String email);
}
