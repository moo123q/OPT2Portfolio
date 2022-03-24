public class Auto extends Voertuig {
    private String TypeAuto;

    public Auto(String name, String soortVoertuig, double aantalPk, double weight, String TypeAuto) {
        super(name, soortVoertuig, aantalPk, weight);
        this.TypeAuto = TypeAuto;
    }

    @Override
    public double getTopsnelheid() {
        double topsnelheid = getAantalPk() / getWeight() * 1500;
        return topsnelheid;
    }
}
