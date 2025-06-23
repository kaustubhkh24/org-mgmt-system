package com.kaustubh.orgmgmt.service.impl;

import com.kaustubh.orgmgmt.model.Role;
import com.kaustubh.orgmgmt.repository.RoleRepository;
import com.kaustubh.orgmgmt.service.RoleService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Role not found with id: " + id));
    }

    @Override
    public Role updateRole(Long id, Role updated) {
        Role role = getRoleById(id);
        role.setName(updated.getName());
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(Long id) {
        Role role = getRoleById(id);

        if (!role.getEmployees().isEmpty()) {
            throw new IllegalStateException("Cannot delete role assigned to employees");
        }

        roleRepository.deleteById(id);
    }
}

