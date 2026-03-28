package pl.wsb.fitnesstracker.User_Event;

import jakarta.persistence.*;
import pl.wsb.fitnesstracker.user.api.User;

public class User_Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
