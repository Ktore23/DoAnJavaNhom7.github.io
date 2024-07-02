package com.WebBanHang.NguyenLeThuanKhiet_9057.repository;

import com.WebBanHang.NguyenLeThuanKhiet_9057.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByPhone(String phone);
}
