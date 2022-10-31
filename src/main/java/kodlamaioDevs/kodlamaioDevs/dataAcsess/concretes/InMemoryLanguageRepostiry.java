package kodlamaioDevs.kodlamaioDevs.dataAcsess.concretes;


import kodlamaioDevs.kodlamaioDevs.dataAcsess.abstacrts.LanguageRepostiry;
import kodlamaioDevs.kodlamaioDevs.entites.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepostiry implements LanguageRepostiry {
    List<Language>languages;

    @Autowired
    public InMemoryLanguageRepostiry() {
        languages = new ArrayList<>();
        languages.add(new Language(1,"java"));
        languages.add(new Language(2,"C"));
        languages.add(new Language(3,"javascript"));
        languages.add(new Language(4,"PHP"));

    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(Language language) {
        languages.remove(language);
    }

    @Override
    public void update(Language language, int id) {
        languages.set(id -1, language);
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }
}
