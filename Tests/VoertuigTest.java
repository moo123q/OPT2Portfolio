import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoertuigTest {
    Motorblok motorblok = new Motorblok("Diesel");
    Voertuig voertuig = new Voertuig("Lambo", "Aventador", 1, 1, motorblok);

    @Test
    void getMotorblok() {
        Assert.assertEquals(motorblok, voertuig.getMotorblok());
    }

    @Test
    void getTopsnelheid() {
        Assert.assertEquals(1000, voertuig.getTopsnelheid(), 0.1);
    }

    @Test
    void getSoortVoertuig() {
        Assert.assertEquals("Aventador", voertuig.getSoortVoertuig());
    }

    @Test
    void getVoertuigNummer() {
        Voertuig k = new Voertuig("Lambo", "Aventador", 1, 1, motorblok);
        Assert.assertEquals(2, k.getVoertuignummer(), 0);
    }


}