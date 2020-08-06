package com.mac.onlinecatalog.repository;

import com.mac.onlinecatalog.model.SchoolGroup;
import com.mac.onlinecatalog.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface SchoolGroupRepository extends JpaRepository<SchoolGroup, Integer> {
    

}
