package com.kaustubh.orgmgmt.controller;

import com.kaustubh.orgmgmt.model.SubOrganization;
import com.kaustubh.orgmgmt.service.SubOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suborganizations")
public class SubOrganizationController {

    @Autowired
    private SubOrganizationService subOrgService;

    @PostMapping
    public ResponseEntity<SubOrganization> create(@RequestBody SubOrganization subOrg) {
        return ResponseEntity.ok(subOrgService.createSubOrganization(subOrg));
    }

    @GetMapping
    public ResponseEntity<List<SubOrganization>> getAll() {
        return ResponseEntity.ok(subOrgService.getAllSubOrganizations());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SubOrganization> getById(@PathVariable Long id) {
        return ResponseEntity.ok(subOrgService.getSubOrganizationById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SubOrganization> update(@PathVariable Long id, @RequestBody SubOrganization subOrg) {
        return ResponseEntity.ok(subOrgService.updateSubOrganization(id, subOrg));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        subOrgService.deleteSubOrganization(id);
        return ResponseEntity.noContent().build();
    }
}
