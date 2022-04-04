package app.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "star", nullable = false)
    private Star star;

    @Column(name = "inhabitant", nullable = false)
    private Boolean isInhabitant;

    @Column(name = "distance", nullable = false)
    private Double distance;

    public Planet() {}
}
