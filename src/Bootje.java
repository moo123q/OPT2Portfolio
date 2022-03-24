public class Bootje  extends Voertuig{

    private String TypeBootje;



    public Bootje(String name, String soortVoertuig, double aantalPk, double weight, String TypeBootje) {
        super(name, soortVoertuig, aantalPk, weight);
        this.TypeBootje = TypeBootje;
    }


    @Override
    public double getTopsnelheid() {
        double topsnelheid = getAantalPk() / getWeight() * 2000;
        return topsnelheid;
    }



    public  String getTypeVliegtuig() {
        return TypeBootje;
    }

    public void setTypeVliegtuig(String typeVliegtuig) {
        this.TypeBootje = typeVliegtuig;
    }
}
