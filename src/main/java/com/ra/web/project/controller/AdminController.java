package com.ra.web.project.controller;

import com.ra.web.project.model.LoginModel;
import com.ra.web.project.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin")

public class AdminController {
    private List<User> data;
    @GetMapping(value = {"/index",""})
    public String admin(Model model){
        return "admin/index";
    }
    @GetMapping(value = {"/login"})
    public String login(Model model){
        model.addAttribute("login", new LoginModel());
        return "admin/login";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request, Model model) {
        request.getSession().removeAttribute("user");
        return "redirect:/admin/login";
    }
    @PostMapping(value = {"/login"})
    public String login(@Valid @ModelAttribute("login" )LoginModel login, BindingResult bindingResult, HttpServletRequest request, Model model){
        if (bindingResult.hasErrors()){
            return "admin/login";
        }
        if (login.getUsername().equals("admin") && login.getPassword().equals("123")){
            HttpSession session = request.getSession();
            session.setAttribute("user",login.getUsername());
            return "redirect:/admin";
        }else {
            return "admin/login";
        }
    }
}
