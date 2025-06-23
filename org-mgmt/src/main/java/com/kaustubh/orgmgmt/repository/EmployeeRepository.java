package com.kaustubh.orgmgmt.repository;

import com.kaustubh.orgmgmt.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    boolean existsByRoleId(Long roleId); // 🔥 this line fixes the error
}

