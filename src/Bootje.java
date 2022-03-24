public class Bootje  extends Voertuig{

    private String TypeBoot;



    public Bootje(String name, String soortVoertuig, double aantalPk, double weight, String TypeBootje) {
        super(name, soortVoertuig, aantalPk, weight);
        this.TypeBoot = TypeBootje;
    }


    @Override
    public double getTopsnelheid() {
        double topsnelheid = getAantalPk() / getWeight() * 2000;
        return topsnelheid;
    }



    public  String getTypeBootje() {
        return TypeBoot;
    }

    public void setTypeBootje(String TypeBootje) {
        this.TypeBoot = TypeBootje;
    }
}
