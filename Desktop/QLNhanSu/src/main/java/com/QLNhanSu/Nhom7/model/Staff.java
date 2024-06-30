package com.QLNhanSu.Nhom7.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@Data
@Entity
@Table(name = "Staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_STAFF")
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_ROLE", referencedColumnName = "ID_ROLE")
    private Role role;

    @Column(name = "NAME_STAFF", nullable = false)
    private String name;
}
