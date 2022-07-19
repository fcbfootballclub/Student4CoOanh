package com.example.student4.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "fullname")
    private String fullName;
    @Column(name = "birthday")
    private String birthDate;
    @Column(name = "email")
    private String email;

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");


    public Student(String fullName, String birthDate, String email) {
        this.fullName = fullName;
        this.birthDate = (birthDate);
        this.email = email;
    }

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
