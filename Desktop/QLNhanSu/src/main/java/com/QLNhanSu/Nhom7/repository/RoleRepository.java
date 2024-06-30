package com.QLNhanSu.Nhom7.repository;

import com.QLNhanSu.Nhom7.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}