import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class VoertuigListTest {
    VoertuigList voertuigList = new VoertuigList();

    Motorblok motorblok = new Motorblok("Benzine");
    Voertuig mo = new Voertuig("Lambo", "Aventador", 780, 1500, motorblok);





    @org.junit.jupiter.api.Test
    void getSpecifiekVoertuig() {
        //voertuignummer is hier 1
        voertuigList.addVoertuig(mo);
        Assert.assertEquals(mo, voertuigList.getSpecifiekVoertuig(1));
    }

    @org.junit.jupiter.api.Test
    void addVoertuig() {
        //voertuignummer wordt hier 2
        Assert.assertEquals(0, voertuigList.getVoertuigen().size());
        voertuigList.addVoertuig(mo);
        Assert.assertEquals(1, voertuigList.getVoertuigen().size());

    }

    @org.junit.jupiter.api.Test
    void verwijderVoertuig() {
        //voertuignummer is hier 3. Als we de alle tests in 1 keer uitvoeren wordt het voertuig mo 3 keer toegevoegd,
        //waardoor het voertuignummer van deze "mo" 3 wordt. Als deze test apart wordt uitgevoerd dan is de voertuignummer
        //van deze "mo" 1, omdat de voertuig mo alleen 1 keer wordt toegevoegd.
        voertuigList.addVoertuig(mo);
        Assert.assertEquals(1, voertuigList.getVoertuigen().size());
        voertuigList.verwijderVoertuig(3);
        Assert.assertEquals(0, voertuigList.getVoertuigen().size());
    }
}