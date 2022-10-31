package kodlamaioDevs.kodlamaioDevs.busniess.abstracts;

import kodlamaioDevs.kodlamaioDevs.entites.concretes.Language;

import java.util.List;

public interface LanguageService {
    void add(Language language);
    void delete(Language language);
    void update(Language language, int id);
    List<Language>getAll();
}
