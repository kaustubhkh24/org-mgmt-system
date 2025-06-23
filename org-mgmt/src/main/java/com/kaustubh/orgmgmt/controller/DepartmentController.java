package com.kaustubh.orgmgmt.controller;

import com.kaustubh.orgmgmt.model.Department;
import com.kaustubh.orgmgmt.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @GetMapping
    public ResponseEntity<List<Department>> getAll() {
        return ResponseEntity.ok(deptService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Department> getById(@PathVariable Long id) {
        return ResponseEntity.ok(deptService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Department> create(@RequestBody Department dept) {
        return ResponseEntity.ok(deptService.create(dept));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Department> update(@PathVariable Long id, @RequestBody Department dept) {
        return ResponseEntity.ok(deptService.update(id, dept));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        deptService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

