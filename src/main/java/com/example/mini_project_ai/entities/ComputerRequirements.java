package com.example.mini_project_ai.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class ComputerRequirements {

    @Id
    @GeneratedValue
    private int id;
    private String primaryUsage;
    private String formFactor;
    private double budget;
    private String popularity;
    private String other;
}
