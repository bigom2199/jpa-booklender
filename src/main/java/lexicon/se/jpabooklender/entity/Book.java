package lexicon.se.jpabooklender.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Book  {
   @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(updatable = false)
   private  int bookId;

   @ManyToOne
   @Column
   private  String isbn;

   @Column(nullable = false)
   private  String title;

   @Column(name ="book",length = 100)
   private  int maxLoanDays;

   @ManyToOne
   @JoinColumn(name ="author_id")
   private Author author;


  @ManyToMany(mappedBy = "writtenBooks")
   private Set<Author> authors;


   public Book(String bookName){
     this.bookName = bookName;

   }

}
