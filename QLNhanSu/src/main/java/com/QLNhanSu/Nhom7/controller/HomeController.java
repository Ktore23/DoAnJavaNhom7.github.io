package com.QLNhanSu.Nhom7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "BÁN SẢN PHẨM CHO PET");
        return "Layout";
    }
}