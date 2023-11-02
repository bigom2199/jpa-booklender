package lexicon.se.jpabooklender.entity;




import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Setter
    @Column(nullable = false,length = 100)
    private String firstName;

    @Setter
    @Column(nullable = false,length = 100)
    private  String lastName;



    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name ="book_id" )

    @ManyToMany
    @JoinTable(name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")

    )
    private Set<Book> writtenBooks;


    public Author(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

   public void removeBook(Book book){
       writtenBooks.remove(book);
        book.setAuthors(null);
   }
   public void addWrittenBook(Book writtenBook) {
       writtenBooks.add(writtenBook);
       writtenBook.setAuthor(this);

   }

   public void removeWrittenBook(Book writtenBook){
        writtenBooks.remove(writtenBooks);
        writtenBook.setAuthor(null);
   }


}




