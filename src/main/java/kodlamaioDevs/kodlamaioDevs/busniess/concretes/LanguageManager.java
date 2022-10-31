package kodlamaioDevs.kodlamaioDevs.busniess.concretes;

import kodlamaioDevs.kodlamaioDevs.busniess.abstracts.LanguageService;
import kodlamaioDevs.kodlamaioDevs.dataAcsess.abstacrts.LanguageRepostiry;
import kodlamaioDevs.kodlamaioDevs.entites.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {

    LanguageRepostiry languageRepostiry;

    @Autowired
    public LanguageManager(LanguageRepostiry languageRepostiry) {
        this.languageRepostiry = languageRepostiry;
    }

    @Override
    public void add(Language language) {
        if (isNameExist(language) == false && !idInBound(language.getId())){
            languageRepostiry.add(language);
        }
        else {
            System.out.println("İsim tekrar ediyor veya id geçersiz");
        }
    }

    @Override
    public void delete(Language language) {
        languageRepostiry.delete(language);
    }

    @Override
    public void update(Language language, int id) {
        if (isNameExist(language)== false && idInBound(language.getId())== true && idInBound(id) == true){
            languageRepostiry.update(language,id);
        }
        else {
            System.out.println("İsim tekrar ediyor veya id geçersiz");
        }
    }

    @Override
    public List<Language> getAll() {
        return languageRepostiry.getAll();
    }

    public boolean isNameExist(Language language){
        List<Language>languageList=languageRepostiry.getAll();

         for (Language language1:languageList){

            if (language1.getName().equalsIgnoreCase(language.getName())){
                return true;
            }
         }
         return false;
    }

    public boolean idInBound(int id){
        if (id < 0 && id <= getAll().size()){
            return true;
        }
        else {
            return false;
        }
    }
}
