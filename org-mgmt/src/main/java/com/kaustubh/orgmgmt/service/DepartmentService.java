package com.kaustubh.orgmgmt.service;

import com.kaustubh.orgmgmt.model.Department;
import java.util.List;

public interface DepartmentService {
    List<Department> getAll();
    Department getById(Long id);
    Department create(Department department);
    Department update(Long id, Department department);
    void delete(Long id);
}

