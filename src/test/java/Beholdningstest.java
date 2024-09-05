import org.example.Lagerbeholdning;
import org.example.VareType;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class Beholdningstest {


    private Lagerbeholdning lagerbeholdning;


    @BeforeEach
    public void setUp() {
        lagerbeholdning = new Lagerbeholdning(null);
    }

    @Test
    public void fåAntallAvVareTypeTest() {
        int antall = lagerbeholdning.getAntallAvVareType(VareType varetype);

        Assertions.assertEquals(1, antall);

    }

}
