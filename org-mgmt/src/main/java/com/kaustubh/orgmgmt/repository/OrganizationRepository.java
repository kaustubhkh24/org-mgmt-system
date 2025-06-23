package com.kaustubh.orgmgmt.repository;

import com.kaustubh.orgmgmt.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}
