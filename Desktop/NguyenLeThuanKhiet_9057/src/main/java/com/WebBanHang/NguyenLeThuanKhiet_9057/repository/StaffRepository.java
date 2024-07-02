package com.WebBanHang.NguyenLeThuanKhiet_9057.repository;

import com.WebBanHang.NguyenLeThuanKhiet_9057.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
}
