package com.example.student4.ModuleMark.Model;


import lombok.*;

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
    @Column(name = "idsubject")
    private int idSubject;
    @Column(name = "mark")
    private float mark;
    @Column(name = "note")
    private String note;

}
