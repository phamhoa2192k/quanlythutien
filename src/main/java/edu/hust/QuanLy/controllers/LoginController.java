package edu.hust.QuanLy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.hust.QuanLy.repositories.UserRepository;


@Controller
@RequestMapping("/")
public class LoginController {
    @Autowired private UserRepository userRepository;

    @GetMapping("/login")
    public String getloginPage(){
        return "login";
    }
    

    @PostMapping("/login")
    public String postLoginForm(String username,String password, Model model) {
        if(userRepository.findUserByuserNameAndPassword(username, password) ==  null){
            return  "redirect:/login";
        }
        else{
            return "redirect:/thongke";
        }    
    }
}
