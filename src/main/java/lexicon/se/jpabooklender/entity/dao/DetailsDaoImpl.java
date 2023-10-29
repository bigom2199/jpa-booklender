package lexicon.se.jpabooklender.entity.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import lexicon.se.jpabooklender.entity.Details;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public class DetailsDaoImpl implements DetailsDao {
      @PersistenceContext
      private  EntityManager entityManager;
    @Override
    public Details findById(int id) {
        Details foundDetails = entityManager.find(Details.class,id);
        return foundDetails;
    }

    @Override
    public Collection<Details> findAll() {
      return   entityManager.createQuery("select a from Details a", Details.class).getResultList();

    }
  @Transactional
    @Override
    public Details create(Details details) {
        entityManager.persist(details);
  return details;

    }
 @Transactional
    @Override
    public Details update(Details details) {
        entityManager.merge(details);
       return details;
    }

    @Override
    public void delete(Details details) {
        if(this.findById(details.getDetailsId()) != null)
        entityManager.remove(details);

    }
}
