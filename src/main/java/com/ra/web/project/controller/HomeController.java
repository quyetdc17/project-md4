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
import java.sql.Timestamp;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
    private List<User> data;
    @GetMapping(value = {"/home"})
    public String home(Model model){
        return "home/home";
    }
    @GetMapping(value = {"/login"})
    public String login(Model model){
        model.addAttribute("login", new LoginModel());
        return "home/login";
    }
    @GetMapping("/logout")
    public String logout(HttpServletRequest request, Model model) {
        request.getSession().removeAttribute("user");
        return "redirect:/home/login";
    }
    @PostMapping(value = {"/login"})
    public String login(@Valid @ModelAttribute("login" )LoginModel login, BindingResult bindingResult, HttpServletRequest request, Model model){
        if (bindingResult.hasErrors()){
            return "home/login";
        }
        if (login.getUsername().equals("admin") && login.getPassword().equals("123")){
            HttpSession session = request.getSession();
            session.setAttribute("user",login.getUsername());
            return "redirect:/home";
        }else {
            return "home/login";
        }
    }
    @GetMapping(value = {"/blog"})
    public String blog(Model model){
        model.addAttribute("blog");
        return "home/blog";
    }
    @GetMapping(value = {"/checkout"})
    public String checkout(Model model){
        model.addAttribute("checkout");
        return "home/checkout";
    }
    @GetMapping(value = {"/cart"})
    public String cart(Model model){
        model.addAttribute("cart");
        return "home/cart";
    }
    @GetMapping(value = {"/contact"})
    public String contact(Model model){
        model.addAttribute("contact");
        return "home/contact";
    }
    @GetMapping(value = {"/wishlist"})
    public String wishlist(Model model){
        model.addAttribute("contact");
        return "home/wishlist";
    }
    @GetMapping(value = {"/my-account"})
    public String myAccount(Model model){
        model.addAttribute("contact");
        return "home/my-account";
    }
    @GetMapping(value = {"/about"})
    public String about(Model model){
        model.addAttribute("pageTitle","Page title");
        return "home/about";
    }
    @GetMapping(value = {""})
    public String index(HttpServletRequest request,Model model){
        if (request.getSession().getAttribute("user") == null){
            return "redirect:/home/login";
        }
        model.addAttribute("fullName", "Do Cong Quyet");
        model.addAttribute("user", new User());
        model.addAttribute("data", data );
        return "home/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("user",new User("uuid1","default","user@email.com","000000000",new Timestamp(2012/10/29),"tokyo",true,"123",true));
        return "home/create";
    }
    @PostMapping("/create")
    public String create(User user,Model model){
        data.add(user);
        return "redirect:/home";
    }
}
