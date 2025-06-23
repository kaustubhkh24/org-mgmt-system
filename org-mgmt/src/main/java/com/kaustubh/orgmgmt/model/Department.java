package com.kaustubh.orgmgmt.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // ✅ FIX: Add the missing subOrganization field to resolve the startup error
    @ManyToOne
    @JoinColumn(name = "sub_organization_id")
    private SubOrganization subOrganization;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Role> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
