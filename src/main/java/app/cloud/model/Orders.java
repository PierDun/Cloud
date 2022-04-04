package app.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.Period;

@Data
@AllArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Users users;

    @ManyToOne
    @JoinColumn(name = "weapon", nullable = false)
    private Weapon weapon;

    @ManyToOne
    @JoinColumn(name = "planet", nullable = false)
    private Planet planet;

    @Column(name = "order_time", nullable = false)
    private LocalDateTime orderTime = LocalDateTime.now();

    @Column(name = "duration")
    private Period period;

    public Orders() {}
}