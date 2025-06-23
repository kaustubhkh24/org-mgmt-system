package com.kaustubh.orgmgmt.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // ✅ Fix: This makes 'mappedBy = "department"' in Department.java valid
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<Employee> employees;
}


