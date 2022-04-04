package app.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bolt", nullable = false)
    private Corp bolt;

    @ManyToOne
    @JoinColumn(name = "barrel", nullable = false)
    private Corp barrel;

    @ManyToOne
    @JoinColumn(name = "stock", nullable = false)
    private Corp stock;

    @ManyToOne
    @JoinColumn(name = "grip", nullable = false)
    private Corp grip;

    @ManyToOne
    @JoinColumn(name = "sight", nullable = false)
    private Corp sight;

    public Weapon() {}
}