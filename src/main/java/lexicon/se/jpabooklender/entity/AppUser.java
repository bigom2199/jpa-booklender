
package lexicon.se.jpabooklender.entity;


import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appUserId;

    @Column(unique=true)
    private String username;

    @Column(nullable = false,length = 100)
    private String password;

    @Column(unique = true)
    private LocalDate regdate;

    @OneToOne
    @JoinColumn
    private Details details;

   @ManyToMany
   @JoinTable()
    private AppUser borrow;
    private Book book;
    public void BookLoan(){

    }

  public AppUser(int appUserId,String username,String password,LocalDate regdate){
      this.appUserId =appUserId;
      this.username = username;
      this.password = password;



  }

}
