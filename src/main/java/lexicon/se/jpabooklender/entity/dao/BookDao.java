package lexicon.se.jpabooklender.entity.dao;


import jakarta.persistence.Entity;
import lexicon.se.jpabooklender.entity.Book;

import java.util.Collection;


@Entity
public interface BookDao {
     Book findById(int id);
    Collection<Book> findAll();
    Book create(Book book);
    Book update(Book book);
    void delete(Book book);
}
