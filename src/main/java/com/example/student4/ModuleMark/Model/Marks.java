package com.example.student4.ModuleMark.Model;


import lombok.*;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "Marks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column(name = "idsinhvien")
    private int idSinhVien;
    private int idSubject;
    private float mark;
    private String note;

}
