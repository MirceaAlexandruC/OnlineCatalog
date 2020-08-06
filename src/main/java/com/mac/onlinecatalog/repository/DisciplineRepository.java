package com.mac.onlinecatalog.repository;

import com.mac.onlinecatalog.model.Discipline;
import com.mac.onlinecatalog.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
    

}
