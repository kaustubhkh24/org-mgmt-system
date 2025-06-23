package com.kaustubh.orgmgmt.controller;

import com.kaustubh.orgmgmt.model.Organization;
import com.kaustubh.orgmgmt.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationService orgService;

    @GetMapping
    public ResponseEntity<List<Organization>> getAll() {
        return ResponseEntity.ok(orgService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Organization> getById(@PathVariable Long id) {
        return ResponseEntity.ok(orgService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Organization> create(@RequestBody Organization org) {
        return ResponseEntity.ok(orgService.create(org));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Organization> update(@PathVariable Long id, @RequestBody Organization org) {
        return ResponseEntity.ok(orgService.update(id, org));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orgService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

