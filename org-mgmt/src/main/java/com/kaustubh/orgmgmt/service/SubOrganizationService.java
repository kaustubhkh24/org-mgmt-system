package com.kaustubh.orgmgmt.service;

import com.kaustubh.orgmgmt.model.SubOrganization;

import java.util.List;

public interface SubOrganizationService {
    SubOrganization createSubOrganization(SubOrganization subOrg);
    List<SubOrganization> getAllSubOrganizations();
    SubOrganization getSubOrganizationById(Long id);
    SubOrganization updateSubOrganization(Long id, SubOrganization subOrg);
    void deleteSubOrganization(Long id);
}
