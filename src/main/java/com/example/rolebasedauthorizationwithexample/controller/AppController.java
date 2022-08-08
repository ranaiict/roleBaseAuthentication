package com.example.rolebasedauthorizationwithexample.controller;

import com.example.rolebasedauthorizationwithexample.model.Role;
import com.example.rolebasedauthorizationwithexample.model.Student;
import com.example.rolebasedauthorizationwithexample.model.User;
import com.example.rolebasedauthorizationwithexample.repository.RoleRepository;
import com.example.rolebasedauthorizationwithexample.repository.UserRepository;
import com.example.rolebasedauthorizationwithexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class AppController {
    @Autowired
    private RoleRepository roleRepo;
    @Autowired
    private UserRepository userRepo;
    private final StudentService studentService;

    public AppController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("listStudent", studentService.listStudent());
        return "index";
    }

    @GetMapping("/new")
    public String add_student(){
        return "new_student";
    }

    @PostMapping("/save")
    public String saveStudent(Model model, @ModelAttribute Student student){
        studentService.save(student);
        model.addAttribute("listStudent", studentService.listStudent());
        return "index";
    }

    @GetMapping("/users")
    public String showUserList(Model model){
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users_list";
    }

    @GetMapping("/newuser")
    public String showCreateNewUserForm(Model model){
        List<Role> listRoles = roleRepo.findAll();
        model.addAttribute("listRoles", listRoles);
        model.addAttribute("user", new User());
        return "user_form.html";
    }

    @PostMapping("/saveuser")
    public String saveUser(Model model, @ModelAttribute User user){
        user = userRepo.save(user);
        return "redirect:/users_list";
    }
}
