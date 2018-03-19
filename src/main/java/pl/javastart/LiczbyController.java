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
    Podzielne podzielne = new Podzielne();

    int sumaDo=liczba.getSumaDo();
    int wynik=liczba.dodaj(sumaDo);
    long granica=fb.getGranica();
    long wynikF=fb.sumaFibonacci(granica);
    int zakresPodzielne=20;
    int podzielna=podzielne.podzielna();

    model.addAttribute("wynikF", wynikF);
    model.addAttribute("granica", granica);
    model.addAttribute("wynik", wynik);
    model.addAttribute("liczba", sumaDo);
    model.addAttribute("zakresPodzielne", zakresPodzielne);
    model.addAttribute("podzielna", podzielna);

    return "index";

    }


}
