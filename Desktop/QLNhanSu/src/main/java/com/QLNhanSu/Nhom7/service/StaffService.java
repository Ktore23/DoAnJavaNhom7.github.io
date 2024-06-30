package com.QLNhanSu.Nhom7.service;

import com.QLNhanSu.Nhom7.model.Staff;
import com.QLNhanSu.Nhom7.repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class StaffService {
    private final StaffRepository staffRepository;
    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    public Optional<Staff> getStaffById(Long id) {
        return staffRepository.findById(id);
    }

    public Staff addStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    public Staff updateStaff(Staff staff) {
        Staff existingStaff = staffRepository.findById((long)
                        staff.getId())
                .orElseThrow(() -> new IllegalStateException("Staff with ID " + staff.getId() + " does not exist."));
        existingStaff.setName(staff.getName());
        return staffRepository.save(existingStaff);
    }

    public void deleteStaffById(Long id) {
        if (!staffRepository.existsById(id)) {
            throw new IllegalStateException("Staff with ID " + id + " does not exist.");
        }
        staffRepository.deleteById(id);
    }
}
