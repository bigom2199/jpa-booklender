
package lexicon.se.jpabooklender.entity;


import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appUserId;

   @Setter
    @Column(unique=true)
    private String username;

    @Setter
    @Column(nullable = false,length = 100)
    private String password;

    @Column(unique = true)
    private LocalDate regdate;

    @OneToOne
    @JoinColumn()
    private Details details;

   @ManyToMany
   @JoinTable(name = "book_borrow",
            joinColumns = @JoinColumn(name = "book_id"),
              inverseJoinColumns=@JoinColumn(name="borrow_id")
     )
    private Set<Book> books;
   @OneToOne
    private Book book;





  public AppUser(int appUserId,String username,String password,LocalDate regdate,String borrow){
      this.appUserId =appUserId;
      this.username = username;
      this.password = password;
  }

}
