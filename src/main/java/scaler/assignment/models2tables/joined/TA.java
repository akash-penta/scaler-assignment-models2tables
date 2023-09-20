package scaler.assignment.models2tables.joined;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "j_ta")
public class TA extends User {
    private double avg_rating;
}
