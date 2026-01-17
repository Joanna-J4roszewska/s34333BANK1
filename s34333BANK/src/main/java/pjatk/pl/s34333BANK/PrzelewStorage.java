package pjatk.pl.s34333BANK;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;


@Component
public class PrzelewStorage {
    private ArrayList<Przelew> przelew = new ArrayList<>();

    public PrzelewStorage() {
        przelew.add(new Przelew("ID-001","2000","100","Jan"));
        przelew.add(new Przelew("ID-002","4000","1000", "Maria"));
        przelew.add(new Przelew("ID-003","1000","10", "Krystian"));
    }
    public ArrayList<Przelew> getPrzelew(String id) {
        return przelew;
    }
    public Optional<Przelew> newPrzelew(Przelew przelew) {
        this.przelew.add(przelew);
     return Optional.of(przelew);
    }


    public void createPrzelew(String s, String maria) {
    }
}
