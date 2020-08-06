package com.mac.onlinecatalog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Grade {

    private double value;
    private Date gradeDate;
//    relatie de Many to Many cu Students

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int gradeId;

    @ManyToMany(mappedBy = "grades")
    private List<Student> students;
}
