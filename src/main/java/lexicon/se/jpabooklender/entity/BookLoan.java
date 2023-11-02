package lexicon.se.jpabooklender.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class BookLoan {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",strategy = "")
    @Column(updatable = false)
    private  int loanId;


    private LocalDate loanDate;
    private LocalDate dueDate;
    private boolean returned;



   @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @Column(updatable = false)
    private AppUser borrower;

    @ManyToOne()
    @JoinColumn(name = "book_id")

    private Book book;
}
