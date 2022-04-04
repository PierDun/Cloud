package app.cloud.controller;

import app.cloud.model.Role;
import app.cloud.model.Users;
import app.cloud.repository.RoleRepository;
import app.cloud.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final RoleRepository roleRepository;

    @GetMapping()
    public List<Users> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public Users getById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @GetMapping("/{name}")
    public Users getByName(@PathVariable String name) {
        return userService.getByName(name);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        try {
            Users users = userService.getUserByLoginPassword(login, password);
            return "user-page";
        } catch (EntityNotFoundException e) {
            model.addAttribute("msg", "User not found");
            return "login-form";
        }
    }

    @PostMapping("/register")
    public String register(HttpServletRequest request) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        String mail = request.getParameter("mail");
        Users user = new Users();
        Role role = roleRepository.findById(1L).get();
        user.setName(login);
        user.setPassword(password);
        user.setMail(mail);
        user.setRole(role);
        userService.addUser(user);
        return "user-page";
    }
}
