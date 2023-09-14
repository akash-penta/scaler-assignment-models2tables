package scaler.assignment.models2tables.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "player_id")
public class Bot extends Player{

    @Column(name = "bot_rank")
    private String rank;
}
