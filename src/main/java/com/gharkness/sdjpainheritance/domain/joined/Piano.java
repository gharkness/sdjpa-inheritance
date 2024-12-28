package com.gharkness.sdjpainheritance.domain.joined;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Piano extends Instrument {

    private Integer numberOfKeys;
}
