package lexicon.se.jpabooklender.entity.dao;

import jakarta.persistence.TypedQuery;
import lexicon.se.jpabooklender.entity.AppUser;

import java.util.Collection;

public interface AppUserDao {
    AppUser findById(int id);
    Collection<AppUser> findAll();
    AppUser create (AppUser appUser);
    AppUser update(AppUser appUser);
    void delete(AppUser appUser);
}
