package com.WebBanHang.NguyenLeThuanKhiet_9057.repository;

import com.WebBanHang.NguyenLeThuanKhiet_9057.model.Role_Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role_Login, Long> {
    Role_Login findRoleById(Long id);
}