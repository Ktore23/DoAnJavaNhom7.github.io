package com.WebBanHang.NguyenLeThuanKhiet_9057.controller;

import com.WebBanHang.NguyenLeThuanKhiet_9057.model.Staff;
import com.WebBanHang.NguyenLeThuanKhiet_9057.service.RoleService;
import com.WebBanHang.NguyenLeThuanKhiet_9057.service.StaffService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staffs")
public class StaffController {
    @Autowired
    private StaffService staffService;

    @Autowired
    private RoleService roleService;

    @GetMapping
    public String showStaffList(Model model) {
        model.addAttribute("staffs", staffService.getAllStaffs());
        return "/staffs/staffs-list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("staff", new Staff());
        model.addAttribute("roles", roleService.getAllRoles());
        return "/staffs/add-staff";
    }

    @PostMapping("/add")
    public String addStaff(@Valid Staff staff, BindingResult result) {
        if (result.hasErrors()) {
            return "/staffs/add-staff";
        }
        staffService.addStaff(staff);
        return "redirect:/staffs";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Staff staff = staffService.getStaffById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid staff Id:" + id));
        model.addAttribute("staff", staff);
        model.addAttribute("roles", roleService.getAllRoles());
        return "/staffs/update-staff";
    }

    @PostMapping("/update/{id}")
    public String updateStaff(@PathVariable Long id, @Valid Staff staff, BindingResult result) {
        if (result.hasErrors()) {
            staff.setId(Math.toIntExact(id));
            return "/staffs/update-staff";
        }
        staffService.updateStaff(staff);
        return "redirect:/staffs";
    }

    @GetMapping("/delete/{id}")
    public String deleteStaff(@PathVariable Long id) {
        staffService.deleteStaffById(id);
        return "redirect:/staffs";
    }
}
