package app.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Star {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "distance", nullable = false)
    private Double distance;

    @Column(name = "angle", nullable = false)
    private Double angle;

    public Star() {}
}