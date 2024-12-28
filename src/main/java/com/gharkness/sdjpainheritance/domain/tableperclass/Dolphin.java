package com.gharkness.sdjpainheritance.domain.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dolphin extends Mammal{

    private Boolean hasSpots;
}
