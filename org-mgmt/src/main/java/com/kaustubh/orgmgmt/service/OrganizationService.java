package com.kaustubh.orgmgmt.service;

import com.kaustubh.orgmgmt.model.Organization;

import java.util.List;

public interface OrganizationService {
    List<Organization> getAll();
    Organization getById(Long id);
    Organization create(Organization organization);
    Organization update(Long id, Organization organization);
    void delete(Long id);
}

