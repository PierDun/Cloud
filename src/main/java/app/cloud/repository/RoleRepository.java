package app.cloud.repository;

import app.cloud.model.Role;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role,Long> {
    @Query("select r from Role r")
    List<Role> findAllRoles ();

    Optional<Role> findByName (String name);
}