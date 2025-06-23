package com.kaustubh.orgmgmt.service.impl;

import com.kaustubh.orgmgmt.model.Employee;
import com.kaustubh.orgmgmt.repository.EmployeeRepository;
import com.kaustubh.orgmgmt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = getEmployeeById(id);
        existing.setName(employee.getName());
        return employeeRepo.save(existing);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }
}
