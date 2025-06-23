package com.kaustubh.orgmgmt.repository;

import com.kaustubh.orgmgmt.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
