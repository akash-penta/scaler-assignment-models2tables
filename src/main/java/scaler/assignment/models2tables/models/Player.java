package scaler.assignment.models2tables.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Player {
    @Id
    private long id;
    private String name;
    private int age;
}
