package scaler.assignment.models2tables.joined;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "j_student")
public class Student extends User {
    private double psp;
    private double attendence;
}
