public class Bootje  extends Voertuig{

    private String bootMerk;



    public Bootje(String name, String soortVoertuig, double aantalPk, double weight, Motorblok motorblok, String bootMerk) {
        super(name, soortVoertuig, aantalPk, weight, motorblok);
        this.bootMerk = bootMerk;
    }


    @Override
    public double getTopsnelheid() {
        double topsnelheid = getAantalPk() / getWeight() * 2000;
        return topsnelheid;
    }


    public String getBootMerk() {
        return bootMerk;
    }

    public void setBootMerk(String bootMerk) {
        this.bootMerk = bootMerk;
    }
}
