package com.kaustubh.orgmgmt.service.impl;

import com.kaustubh.orgmgmt.model.Organization;
import com.kaustubh.orgmgmt.repository.OrganizationRepository;
import com.kaustubh.orgmgmt.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepo;

    @Override
    public List<Organization> getAll() {
        return organizationRepo.findAll();
    }

    @Override
    public Organization getById(Long id) {
        return organizationRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Organization not found with id: " + id));
    }

    @Override
    public Organization create(Organization organization) {
        return organizationRepo.save(organization);
    }

    @Override
    public Organization update(Long id, Organization organization) {
        Organization existing = getById(id);
        existing.setName(organization.getName());
        return organizationRepo.save(existing);
    }

    @Override
    public void delete(Long id) {
        organizationRepo.deleteById(id);
    }
}

