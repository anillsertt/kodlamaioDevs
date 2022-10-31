package kodlamaioDevs.kodlamaioDevs.dataAcsess.abstacrts;

import kodlamaioDevs.kodlamaioDevs.entites.concretes.Language;

import java.util.List;

public interface LanguageRepostiry {
    void add(Language language);
    void delete(Language language);
    void update(Language language,int id);
    List<Language>getAll();


}
