package pjatk.pl.s34333BANK;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PrzelewStatusServiceTest {
    @Mock
    private PrzelewStorage przelewStorage;

    @InjectMocks
    private PrzelewStatusService przelewStatusService;

    @Test
    void przelewStatusServiceTest() {

    }
}
