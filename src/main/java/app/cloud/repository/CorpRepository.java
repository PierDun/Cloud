package app.cloud.repository;

import app.cloud.model.Corp;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CorpRepository extends CrudRepository<Corp,Long> {
    @Query("select r from Role r")
    List<Corp> findAllRoles ();

    Optional<Corp> findByName (String name);
}