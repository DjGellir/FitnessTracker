package pl.wsb.fitnesstracker.Activity_Type;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.training.internal.ActivityType;

public class Activity_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "activity_type", nullable = false)
    private ActivityType activityType;
}
