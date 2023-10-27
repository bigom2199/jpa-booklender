package lexicon.se.jpabooklender.entity.dao;

import lexicon.se.jpabooklender.entity.Author;

import java.util.Collection;

public interface AuthorDao {
    Author  findById(int id);
    Collection<Author> findAll();
    Author create(Author author);
    Author update(Author author);
    void delete(Author author);

}
