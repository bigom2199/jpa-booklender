package lexicon.se.jpabooklender.entity;


import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appUserId;
    @OneToOne
    @Column(unique=true)
    private String username;

    @Column(nullable = false,length = 100)
    private String password;
    @OneToOne
    @Column(unique = true)
    private LocalDate regdate;
    @OneToOne
    @JoinColumn
    private Details details;
  public AppUser(int appUserId,String username,String password,LocalDate regdate){
      this.appUserId =appUserId;
      this.username = username;
      this.password = password;

  }
}
