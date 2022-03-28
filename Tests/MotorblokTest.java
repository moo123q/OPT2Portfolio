import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorblokTest {
    Motorblok motorblok = new Motorblok("Diesel");
    Motorblok motorblok2 = new Motorblok("Benzine");
    @Test
    void isZuinig() {
        Assert.assertEquals("Dit voertuig is zuinig", motorblok.isZuinig());
        Assert.assertEquals("Dit voertuig is niet zuinig", motorblok2.isZuinig());
    }
}