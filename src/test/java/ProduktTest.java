import org.example.Leveranse;
import org.example.Produkt;
import org.example.VareType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProduktTest {

    private Produkt produktTelefon;

    @BeforeEach
    public void setUp() {
        produktTelefon = new Produkt("1", VareType.Telefon, 5, "Hylle A");
    }

    @Test
    public void testSetAntallTelefon() {
        Leveranse leveranse = produktTelefon.setAntall();
        assertEquals(45, produktTelefon.getAntall(), "Antall etter påfyll av Telefon skal være 45");
    }

    @Test
    public void testSetAntallNoRefill() {
        Produkt produktOverTerskel = new Produkt("4", VareType.Telefon, 20, "Hylle D");
        Leveranse leveranse = produktOverTerskel.setAntall();

        assertEquals(20, produktOverTerskel.getAntall(), "Antall skal ikke endres for produkter som ikke trenger påfyll");
    }
}

