package com.mac.onlinecatalog.service;

import com.mac.onlinecatalog.model.SchoolGroup;
import com.mac.onlinecatalog.model.Student;
import com.mac.onlinecatalog.repository.SchoolGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ISchoolGroupService")
public class SchoolGroupService {

    @Autowired
    private SchoolGroupRepository schoolGroupRepository;



    public List<SchoolGroup> findAll() {
        return schoolGroupRepository.findAll();
    }

    public void save(SchoolGroup schoolGroup) {
        schoolGroupRepository.save(schoolGroup);
    }

    public List<Student> findStudentsByGroup(Integer id) {
        //TODO: try catch / check if present
        return schoolGroupRepository.findById(id).get().getStudents();
    }


}
