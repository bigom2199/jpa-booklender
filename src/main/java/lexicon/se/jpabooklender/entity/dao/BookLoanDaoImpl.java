package lexicon.se.jpabooklender.entity.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lexicon.se.jpabooklender.entity.BookLoan;
import org.springframework.stereotype.Repository;

import java.util.Collection;
 @Repository
public class BookLoanDaoImpl implements BookLoanDao {
     @PersistenceContext
     private EntityManager entityManager;

    @Override
    public BookLoan findById(int id) {
        BookLoan foundBookLoan =entityManager.find(BookLoan.class,id);
        return foundBookLoan;
    }

    @Override
    public Collection<BookLoan> findAll() {
        entityManager.createQuery("select b from BookLoan b",BookLoan.class).getResultList();
        return null;
    }

    @Override
    public BookLoan create(BookLoan bookLoan) {
        entityManager.persist(bookLoan);
        return bookLoan;
    }

    @Override
    public BookLoan update(BookLoan bookLoan) {
        entityManager.merge(bookLoan);
        return bookLoan;
    }

    @Override
    public void delete(BookLoan bookLoan) {
      if(this.findById(bookLoan.getLoanId()) != null){
          entityManager.remove(bookLoan);
      }
    }
}
