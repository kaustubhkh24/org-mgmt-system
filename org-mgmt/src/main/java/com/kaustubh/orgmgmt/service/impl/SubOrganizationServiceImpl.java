package com.kaustubh.orgmgmt.service.impl;

import com.kaustubh.orgmgmt.model.SubOrganization;
import com.kaustubh.orgmgmt.repository.SubOrganizationRepository;
import com.kaustubh.orgmgmt.service.SubOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubOrganizationServiceImpl implements SubOrganizationService {

    @Autowired
    private SubOrganizationRepository subOrgRepo;

    @Override
    public SubOrganization createSubOrganization(SubOrganization subOrg) {
        return subOrgRepo.save(subOrg);
    }

    @Override
    public List<SubOrganization> getAllSubOrganizations() {
        return subOrgRepo.findAll();
    }

    @Override
    public SubOrganization getSubOrganizationById(Long id) {
        return subOrgRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("SubOrganization not found with id: " + id));
    }

    @Override
    public SubOrganization updateSubOrganization(Long id, SubOrganization subOrg) {
        SubOrganization existing = getSubOrganizationById(id);
        existing.setName(subOrg.getName());
        existing.setOrganization(subOrg.getOrganization());
        return subOrgRepo.save(existing);
    }

    @Override
    public void deleteSubOrganization(Long id) {
        subOrgRepo.deleteById(id);
    }
}
