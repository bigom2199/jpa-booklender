package lexicon.se.jpabooklender.entity;




import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;



@Entity
public class Details {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private int detailsId;


    private String email;
    private String name;
    private LocalDate birthDate;
}
