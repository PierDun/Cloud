package app.cloud.repository;

import app.cloud.model.Role;
import app.cloud.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<Users,Long> {
    @Query("select u from Users u")
    List<Users> findAllUsers();

    Optional<Users> findByName (String name);

    Optional<Users> findByMail (String mail);

    Optional<Users> findByPassword (String password);

    Optional<Users> findByRole (Role role);

    Optional<Users> findByNameAndPassword (String name, String password);
}