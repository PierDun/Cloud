package app.cloud.repository;

import app.cloud.model.Corp;
import app.cloud.model.Weapon;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface WeaponRepository extends CrudRepository<Weapon,Long> {
    @Query("select w from Weapon w")
    List<Weapon> findAllWeapons ();

    Optional<Weapon> findByBarrel (Corp corp);

    Optional<Weapon> findByBolt (Corp corp);

    Optional<Weapon> findByStock (Corp corp);

    Optional<Weapon> findBySight (Corp corp);

    Optional<Weapon> findByGrip (Corp corp);
}