package app.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages")
public class PagesController {
    @GetMapping("/register")
    String showRegisterForm () {
        return "register-form";
    }

    @GetMapping("/login")
    String showLoginForm () {
        return "login-form";
    }
}
