package lexicon.se.jpabooklender.entity;

import jakarta.persistence.*;

@Entity
public class Book  {
   @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
   private  int bookId;
   @ManyToOne
   @Column
   private  String isbn;
   @Column
   private  String title;
   @Column
   private  int maxLoanDays;
}
