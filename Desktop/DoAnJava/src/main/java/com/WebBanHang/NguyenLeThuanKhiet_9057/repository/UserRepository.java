package com.WebBanHang.NguyenLeThuanKhiet_9057.repository;

import com.WebBanHang.NguyenLeThuanKhiet_9057.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
