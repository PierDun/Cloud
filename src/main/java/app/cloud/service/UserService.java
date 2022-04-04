package app.cloud.service;

import app.cloud.model.Users;
import app.cloud.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<Users> getUsers() {
        return userRepository.findAllUsers();
    }

    public Users getById (Long id) {
        return userRepository.findById(id).
                orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
    }

    public Users getByName(String name) {
        return userRepository.findByName(name).
                orElseThrow(() -> new EntityNotFoundException(name));
    }

    public Users getUserByLoginPassword (String name, String password) {
        return userRepository.findByNameAndPassword(name, password).
                orElseThrow(() -> new EntityNotFoundException(String.valueOf(name)));
    }

    public boolean checkForUser (String name, String password) {
        try {
            Users users = getUserByLoginPassword(name, password);
            return true;
        } catch (EntityNotFoundException e) {
            return false;
        }
    }

    public void deleteUser(Long id) {
        Users users = getById(id);
        deleteUser(users);
    }

    public void deleteUser(Users users) {
        userRepository.delete(users);
    }

    public void addUser(Users users) {
        userRepository.save(users);
    }
}