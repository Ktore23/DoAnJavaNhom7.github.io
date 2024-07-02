package com.WebBanHang.NguyenLeThuanKhiet_9057.controller;

import org.hibernate.query.ReturnableType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String hello(Model model) {
        model.addAttribute("message", "BÁN SẢN PHẨM CHO PET");
        return "LayoutHome";
    }
}
