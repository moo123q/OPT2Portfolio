public class Voertuig {

    private double aantalPk;
    private double topsnelheid;
    private double weight;
    private String name;
    private String soortVoertuig;

    private Integer voertuignummer = 1;
    private static Integer volgendeVoertuignummer = 1;

    public Voertuig(String name, String soortVoertuig, double aantalPk, double weight){
        this.aantalPk = aantalPk;
        this.weight = weight;
        this.name = name;
        this.soortVoertuig = soortVoertuig;
        voertuignummer = volgendeVoertuignummer;
        volgendeVoertuignummer++;
    }

    public String getName() {

        return name;
    }
    public Integer getVoertuignummer()
    {

        return voertuignummer;
    }


    public double getWeight(){


        return weight;
    }


    public void setName(String name) {

        this.name = name;
    }

    public double getTopsnelheid(){

        topsnelheid = aantalPk / weight * 1000;

        return topsnelheid;
    }

    public double getAantalPk(){

        return aantalPk;
    }

    public String getSoortVoertuig(){

        return soortVoertuig;
    }



}
