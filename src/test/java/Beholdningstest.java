import org.example.Lagerbeholdning;
import org.example.Produkt;
import org.example.VareType;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class Beholdningstest {


    //private Lagerbeholdning lagerbeholdning;


    /*@BeforeEach
    public void setUp() {

        List<Batch> list = new ArrayList<>();
        Batch batch1 = new Batch((new Produkt("A", VareType.Laptop)), 5,"hylle A4");
        list.add(batch1);

        lagerbeholdning = new Lagerbeholdning(list);
    }*/

    @Test
    public void fåAntallAvVareTypeTest() {
        List<Produkt> list = new ArrayList<>();
        Produkt batch1 = new Produkt("A", VareType.Laptop, 5,"hylle A4");
        list.add(batch1);

        Lagerbeholdning lagerbeholdning = new Lagerbeholdning(list);
        int antall = lagerbeholdning.getAntallAvVareType(VareType.Laptop);

        Assertions.assertEquals(5, antall);
    }

    /*@Test
    public void påfyllTest() {
        List<Produkt> list = new ArrayList<>();
        Produkt batch1 = new Produkt("A", VareType.Laptop, 4,"hylle A4");
        list.add(batch1);

        Lagerbeholdning lagerbeholdning = new Lagerbeholdning(list);
        lagerbeholdning.påfyll(null);

        Produkt p = lagerbeholdning.getProdukter().getFirst();


        Assertions.assertEquals(19, p.getAntall());
    }*/

    @Test
    public void printLagerBeholdningTest() {
        List<Produkt> list = new ArrayList<>();
        Produkt batch1 = new Produkt("A", VareType.Laptop, 4,"hylle A4");
        list.add(batch1);

        Lagerbeholdning lagerbeholdning = new Lagerbeholdning(list);

        lagerbeholdning.printLagerbeholdning();
    }

}
