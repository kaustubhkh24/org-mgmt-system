package com.kaustubh.orgmgmt.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "sub_organizations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubOrganization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @OneToMany(mappedBy = "subOrganization", cascade = CascadeType.ALL)
    private List<Department> departments;
}
