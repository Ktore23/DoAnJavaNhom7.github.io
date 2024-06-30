package com.QLNhanSu.Nhom7.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Data
@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROLE")
    private int id;

    @Column(name = "NAME_ROLE", nullable = false)
    private String name;

    @OneToMany(mappedBy = "role")
    private Set<Staff> products;
}
