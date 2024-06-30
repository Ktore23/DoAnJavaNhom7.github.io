package com.QLNhanSu.Nhom7.repository;

import com.QLNhanSu.Nhom7.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
}
