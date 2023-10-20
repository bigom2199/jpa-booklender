package lexicon.se.jpabooklender.entity.dao;

import lexicon.se.jpabooklender.entity.AppUser;

import java.util.Collection;

public interface AppUserDao {
    AppUser findById(int id);
    Collection<AppUser> findAll();
    AppUser create ();
    AppUser update();
    void delete();
}