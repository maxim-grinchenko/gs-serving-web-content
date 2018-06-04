package com.resolution.controller;

import com.resolution.entity.User;
import com.resolution.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;

@Slf4j
@Controller
public class UserController {

    @Autowired
    private UserRepository repository;

//    @RequestMapping(method = RequestMethod.GET, value = "/")
//    public String home(){
//        return "index";
//    }

    @RequestMapping("/register")
//    @PreAuthorize("hasRole('ROLE_USER')")
    public String register(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", repository.findAll());
        return "register";
    }

    @PostMapping("/save")
//    @PreAuthorize("hasRole('ROLE_USER')")
    public String addUser(@ModelAttribute("user") User user) {
        repository.save(user);
        return "redirect:/view";
    }

    @RequestMapping("/view")
    public String getAllUsers(Model model) {
        model.addAttribute("users", repository.findAll());
        return "view";
    }


    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String email) {

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        repository.save(n);
        return "Saved3";
    }

}
