package lexicon.se.jpabooklender.entity;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class Details {
    private int detailsId;
    private String email;
    private String name;
    private LocalDate birthDate;
}
