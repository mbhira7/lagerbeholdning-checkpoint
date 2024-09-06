import org.example.Lagerbeholdning;
import org.example.Leveranse;
import org.example.Produkt;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class LagerbeholdningTest {

    @Mock
    private Produkt mockProdukt1;

    @Mock
    private Produkt mockProdukt2;

    @InjectMocks
    private Lagerbeholdning lagerbeholdning;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this); // Åpner mockito for klassen
    }

    @Test
    public void testPåfyllMethod() {

        ArrayList<Leveranse> leveranser = new ArrayList<>();


        Leveranse mockLeveranse1 = mock(Leveranse.class);
        Leveranse mockLeveranse2 = mock(Leveranse.class);


        when(mockProdukt1.setAntall()).thenReturn(mockLeveranse1);
        when(mockProdukt2.setAntall()).thenReturn(mockLeveranse2);


        List<Produkt> produkter = new ArrayList<>();
        produkter.add(mockProdukt1);
        produkter.add(mockProdukt2);

        lagerbeholdning = new Lagerbeholdning(produkter);
        lagerbeholdning.påfyll(leveranser);

        assertEquals(2, leveranser.size());
        assertTrue(leveranser.contains(mockLeveranse1));
        assertTrue(leveranser.contains(mockLeveranse2));


        verify(mockProdukt1, times(1)).setAntall();
        verify(mockProdukt2, times(1)).setAntall();
    }
}
