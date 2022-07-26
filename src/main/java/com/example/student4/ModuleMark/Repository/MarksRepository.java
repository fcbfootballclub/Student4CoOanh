package com.example.student4.ModuleMark.Repository;

import com.example.student4.ModuleMark.Model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks, Long> {
}
