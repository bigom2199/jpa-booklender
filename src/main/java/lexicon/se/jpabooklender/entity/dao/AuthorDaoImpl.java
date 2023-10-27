package lexicon.se.jpabooklender.entity.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lexicon.se.jpabooklender.entity.Author;
import org.springframework.stereotype.Repository;

import java.util.Collection;
@Repository
public class AuthorDaoImpl implements AuthorDao{
 @PersistenceContext
        private EntityManager entityManager;
    @Override
    public Author findById(int id) {
     Author foundAuthor =entityManager.find(Author.class,id);
        return foundAuthor;
    }

    @Override
    public Collection<Author> findAll() {
        entityManager.createQuery("select a from Author a",Author.class).getResultList();
        return null;
    }

    @Override
    public Author create(Author author) {
        entityManager.persist(author);
        return author;
    }

    @Override
    public Author update(Author author) {
        entityManager.merge(author);
        return author;
    }

    @Override
    public void delete(Author author) {
        if(this.findById(author.getId()) != null);
        entityManager.remove(author);

    }
}
