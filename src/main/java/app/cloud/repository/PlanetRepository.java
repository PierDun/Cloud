package app.cloud.repository;

import app.cloud.model.Planet;
import app.cloud.model.Star;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PlanetRepository extends CrudRepository<Planet, Long> {
    @Query("select p from Planet p")
    List<Planet> findAllPlanets ();

    Optional<Planet> findByName (String name);

    Optional<Planet> findByDistance (Double distance);

    Optional<Planet> findByStar (Star star);

    Optional<Planet> findByIsInhabitant (Boolean isInhabitant);
}