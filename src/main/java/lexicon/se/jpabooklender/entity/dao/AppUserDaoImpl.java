package lexicon.se.jpabooklender.entity.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import lexicon.se.jpabooklender.entity.AppUser;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;
   @Repository
public class AppUserDaoImpl implements AppUserDao {
       @PersistenceContext
     private EntityManager entityManager;

    @Override
    public AppUser findById(int id) {
        AppUser foundAppUser = entityManager.find(AppUser.class,id);

        return foundAppUser;
    }

    @Override
    public Collection<AppUser> findAll() {

        return entityManager.createQuery("select a from AppUser a",AppUser.class)
                .getResultList();
    }
    @Transactional
    @Override
    public AppUser create(AppUser appUser) {
        entityManager.persist(appUser);
       return appUser;
    }
     @Transactional
    @Override
    public AppUser update(AppUser appUser) {
        return entityManager.merge(appUser);

    }
   @Transactional
    @Override
    public void delete(AppUser appUser) {

        AppUser foundAppuser = entityManager.find(AppUser.class,appUser);
        if(foundAppuser!= null)entityManager.remove(foundAppuser);




    }
}
