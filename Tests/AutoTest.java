import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    Motorblok motorblok = new Motorblok("diesel");
    Voertuig voertuig = new Auto("Opel", "Auto", 1, 1, motorblok, "Opel");
    @Test
    void getTopsnelheid() {
        Assert.assertEquals(2500, voertuig.getTopsnelheid(), 0);
    }
}