package com.example.student4.mulduleSubjects.Model;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Subject")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "duration")
    private int duration;

}
