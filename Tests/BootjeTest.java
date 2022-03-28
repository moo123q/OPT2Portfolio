import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BootjeTest {

    Motorblok motorblok = new Motorblok("diesel");
    Voertuig voertuig = new Bootje("boot", "Auto", 1, 1, motorblok, "Snoek");
    @Test
    void getTopsnelheid() {
        Assert.assertEquals(2000, voertuig.getTopsnelheid(), 0);
    }
}