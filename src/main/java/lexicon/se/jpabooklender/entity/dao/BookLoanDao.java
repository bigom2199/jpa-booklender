package lexicon.se.jpabooklender.entity.dao;

import lexicon.se.jpabooklender.entity.BookLoan;

import java.util.Collection;

public interface BookLoanDao {
  BookLoan  findById(int id);
  Collection<BookLoan> findAll();
  BookLoan create(BookLoan bookLoan);
  BookLoan update(BookLoan bookLoan);
  void delete(BookLoan bookLoan);
}
