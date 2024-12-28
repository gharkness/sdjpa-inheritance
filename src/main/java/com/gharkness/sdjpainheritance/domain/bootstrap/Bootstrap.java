package com.gharkness.sdjpainheritance.domain.bootstrap;

import com.gharkness.sdjpainheritance.domain.joined.ElectricGuitar;
import com.gharkness.sdjpainheritance.domain.repositories.ElectricGuitarRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private final ElectricGuitarRepository electricGuitarRepository;

    @Override
    public void run(String... args) throws Exception {
        ElectricGuitar eg = new ElectricGuitar();
        eg.setNumberOfStrings(6);
        eg.setNumberOfPickups(2);

        electricGuitarRepository.save(eg);
    }
}
