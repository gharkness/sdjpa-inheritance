package com.gharkness.sdjpainheritance.domain.joined;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Guitar extends Instrument{

    private Integer numberOfStrings;
}
