package pjatk.pl.s34333BANK;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static net.bytebuddy.matcher.ElementMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PrzelewStatusServiceTest {
    @Mock
    private PrzelewStorage przelewStorage;

    @InjectMocks
    private PrzelewStatusService przelewStatusService;

    @Test
    void przelewStorage() {
        przelewStorage.createPrzelew("ID-001", "Maria");

        verify(przelewStorage).createPrzelew("ID-001", "Maria");
    }

}
