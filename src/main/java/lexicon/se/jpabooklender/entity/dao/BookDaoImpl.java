package lexicon.se.jpabooklender.entity.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lexicon.se.jpabooklender.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public class BookDaoImpl implements BookDao {
      @PersistenceContext
     private EntityManager entityManager;
    @Override
    public Book findById(int id) {
        Book foundBook = entityManager.find(Book.class,id);
        return foundBook;
    }

    @Override
    public Collection<Book> findAll() {
        return entityManager.createQuery("select a from Book a",Book.class).getResultList();

    }

    @Override
    public Book create(Book book) {
        entityManager.persist(book);
        return book;
    }

    @Override
    public Book update(Book book) {
        entityManager.merge(book);
        return book;
    }

    @Override
    public void delete(Book book) {
    if(this.findById(book.getBookId()) != null){
        entityManager.remove(book);
    }
    }
}
