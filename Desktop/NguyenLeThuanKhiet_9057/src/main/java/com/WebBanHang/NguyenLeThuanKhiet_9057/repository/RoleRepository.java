package com.WebBanHang.NguyenLeThuanKhiet_9057.repository;

import com.WebBanHang.NguyenLeThuanKhiet_9057.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}