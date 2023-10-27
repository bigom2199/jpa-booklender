package lexicon.se.jpabooklender.entity;





import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter


@Entity
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailsId;

  @Setter
  @Column(nullable = false,unique = true)
    private String email;

  @Setter
  @Column(nullable = false,length = 100)
    private String name;

  @Setter
  @Column()
    private LocalDate birthDate;

  public Details(String name,String email,LocalDate birthDate){
      this.email = email;
      this.name = name;
      this.createDate = LocalDateTime.now();
  }
}
