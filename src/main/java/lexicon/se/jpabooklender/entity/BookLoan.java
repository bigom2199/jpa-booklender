package lexicon.se.jpabooklender.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
@Entity
public class BookLoan {
    @Id

    private  int loanId;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private boolean returned;
    private AppUser borrower;
    private Book book;
}
