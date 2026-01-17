package pjatk.pl.s34333BANK;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PrzelewStatusService {
    private PrzelewStorage storage;

  public PrzelewStatusService(PrzelewStorage storage) {
      this.storage = storage;
  }


    public void createPrzelew(String s, String maria) {
    }

    public void printPrzelew(String s, String krystian) {
    }

    public boolean changeStatus(String s, String dostał) {
      return true;
    }
}
