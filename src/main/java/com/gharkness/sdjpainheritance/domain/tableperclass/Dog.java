package com.gharkness.sdjpainheritance.domain.tableperclass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Dog extends Mammal {

    private String breed;
}
