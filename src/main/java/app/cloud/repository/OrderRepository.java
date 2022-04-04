package app.cloud.repository;

import app.cloud.model.Orders;
import app.cloud.model.Planet;
import app.cloud.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface OrderRepository extends CrudRepository<Orders, Long> {
    @Query("select o from Orders o")
    List<Orders> findAllOrders ();

    Optional<Orders> findByPlanet (Planet planet);

    Optional<Orders> findByUsers (Users users);
}