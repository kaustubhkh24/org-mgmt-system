package com.kaustubh.orgmgmt.service.impl;

import com.kaustubh.orgmgmt.model.Department;
import com.kaustubh.orgmgmt.repository.DepartmentRepository;
import com.kaustubh.orgmgmt.service.DepartmentService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department create(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getById(Long id) {
        return departmentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Department not found with id: " + id));
    }

    @Override
    public Department update(Long id, Department updated) {
        Department department = getById(id);

        // Only update if setters are available in the Department class
        department.setName(updated.getName());

        return departmentRepository.save(department);
    }

    @Override
    public void delete(Long id) {
        Department department = getById(id);

        // Make sure getRoles() exists in Department class
        if (department.getRoles() != null && !department.getRoles().isEmpty()) {
            throw new IllegalStateException("Cannot delete department with assigned roles");
        }

        departmentRepository.deleteById(id);
    }
}
