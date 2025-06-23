package com.kaustubh.orgmgmt.repository;

import com.kaustubh.orgmgmt.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
