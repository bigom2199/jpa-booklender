package lexicon.se.jpabooklender.entity.dao;

import lexicon.se.jpabooklender.entity.Details;

import java.util.Collection;

public interface DetailsDao {
    Details findById(int id);
    Collection<Details>findAll();
    Details create(Details details);

    void delete(Details details);
    Details update(Details details);
}
