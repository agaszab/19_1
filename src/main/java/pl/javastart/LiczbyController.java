package pl.javastart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LiczbyController {

    @Autowired
    private Liczby liczba;

    @GetMapping("/")
    public String main(Model model){

    int sumaDo=liczba.getSumaDo();
    int wynik=liczba.dodaj(sumaDo);

    model.addAttribute("wynik", wynik);
    model.addAttribute("liczba", sumaDo);

    return "index";

    }


}
