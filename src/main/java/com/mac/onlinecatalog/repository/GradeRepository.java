package com.mac.onlinecatalog.repository;

import com.mac.onlinecatalog.model.Grade;
import com.mac.onlinecatalog.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
    

}
