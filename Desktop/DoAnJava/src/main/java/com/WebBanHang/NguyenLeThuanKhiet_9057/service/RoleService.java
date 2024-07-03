package com.WebBanHang.NguyenLeThuanKhiet_9057.service;

import com.WebBanHang.NguyenLeThuanKhiet_9057.model.Role;
import com.WebBanHang.NguyenLeThuanKhiet_9057.repository.RoleRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class RoleService {
    private final RoleRepository roleRepository;
    public List<Role> getAllRoles(){
        return roleRepository.findAll();
    }
    public Optional<Role> getRoleById(Long id) {
        return roleRepository.findById(id);
    }
    public void addRole(Role role) {
        roleRepository.save(role);
    }
    public void updateRole(@NotNull Role role) {
        Role existingRole = roleRepository.findById((long)
                        role.getId())
                .orElseThrow(() -> new IllegalStateException("Role with ID " +
                        role.getId() + " does not exist."));
        existingRole.setName(role.getName());
        roleRepository.save(existingRole);
    }
    public void deleteRoleById(Long id) {
        if (!roleRepository.existsById(id)) {
            throw new IllegalStateException("Role with ID " + id + " does not exist.");
        }
        roleRepository.deleteById(id);
    }
}
