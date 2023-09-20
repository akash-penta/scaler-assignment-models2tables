package scaler.assignment.models2tables.joined;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "j_mentor")
public class Mentor extends User {
    private double avg_rating;
}
