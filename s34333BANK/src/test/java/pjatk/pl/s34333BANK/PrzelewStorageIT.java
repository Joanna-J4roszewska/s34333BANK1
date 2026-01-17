package pjatk.pl.s34333BANK;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

@SpringBootTest
public class PrzelewStorageIT {

    @Autowired
    private PrzelewStorage przelewStorage;

    @Test
    void ShouldAddAndFindPrzelew() {
        Przelew zgloszenie = new Przelew("TEST_IT_1", "2000", "", "Jan");

        przelewStorage.getPrzelew(String.valueOf(zgloszenie));

        Optional<Przelew> znalezione = przelewStorage.newPrzelew(new Przelew("TEST_IT_1", "2000", "", "Jan"));

        Assertions.assertTrue(znalezione.isPresent());
        Assertions.assertEquals(znalezione.get(), zgloszenie);
    }
}
