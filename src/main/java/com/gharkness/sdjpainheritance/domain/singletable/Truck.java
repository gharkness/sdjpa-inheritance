package com.gharkness.sdjpainheritance.domain.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@DiscriminatorValue("truck")
public class Truck extends Vehicle{

    private Integer payload;
}
