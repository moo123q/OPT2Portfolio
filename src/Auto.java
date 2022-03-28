public class Auto extends Voertuig {
    private String autoMerk;

    public Auto(String name, String soortVoertuig, double aantalPk, double weight, Motorblok motorblok, String autoMerk) {
        super(name, soortVoertuig, aantalPk, weight, motorblok);
        this.autoMerk = autoMerk;
    }

    @Override
    public double getTopsnelheid() {
        double topsnelheid = getAantalPk() / getWeight() * 2500;
        return topsnelheid;
    }

    public String getAutoMerk() {
        return autoMerk;
    }

    public void setAutoMerk(String autoMerk) {
        this.autoMerk = autoMerk;
    }
}
