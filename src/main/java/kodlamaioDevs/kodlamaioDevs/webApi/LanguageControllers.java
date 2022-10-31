package kodlamaioDevs.kodlamaioDevs.webApi;

import kodlamaioDevs.kodlamaioDevs.busniess.abstracts.LanguageService;
import kodlamaioDevs.kodlamaioDevs.entites.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/languages")

public class LanguageControllers {
    @Autowired
    LanguageService languageService;

    public LanguageControllers(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping ("/getAll")
    public List<Language>getAll() {

        return languageService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody Language language){
        languageService.add(language);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody Language language){
        languageService.delete(language);
    }
    @PutMapping("/update")
    public void update(Language language, int id){
        languageService.update(language, id);
    }
}
