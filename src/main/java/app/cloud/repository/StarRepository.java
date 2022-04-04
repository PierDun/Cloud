package app.cloud.repository;

import app.cloud.model.Star;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface StarRepository extends CrudRepository<Star, Long> {
    @Query("select s from Star s")
    List<Star> findAllStars();

    Optional<Star> findByName (String name);

    Optional<Star> findByDistance (Double distance);
}