package pl.wsb.fitnesstracker.healthmetrics;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import pl.wsb.fitnesstracker.user.api.User;

import java.time.LocalDate;

public class Health_Metrics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column (name = "weight", nullable = false)
    private double weight;

    @Column (name = "height", nullable = false)
    private double height;

    @Column (name = "heartRate", nullable = false)
    private double heartRate;
}
