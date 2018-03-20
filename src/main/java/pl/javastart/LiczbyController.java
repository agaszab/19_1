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

    Fibonacci fb= new Fibonacci();
    RoznicaKwadratow roznicaKwadratow=new RoznicaKwadratow();

    int sumaDo=liczba.getSumaDo();
    int wynik=liczba.dodaj(sumaDo);
    long granica=fb.getGranica();
    long wynikF=fb.sumaFibonacci(granica);
    int limit=roznicaKwadratow.getLimit();
    int roznica=roznicaKwadratow.roznicaKwadratow(limit);

    model.addAttribute("wynikF", wynikF);
    model.addAttribute("granica", granica);
    model.addAttribute("wynik", wynik);
    model.addAttribute("liczba", sumaDo);
    model.addAttribute("roznica", roznica);
    model.addAttribute("limit", limit);

    return "index";

    }


}
