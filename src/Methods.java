import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    private VoertuigList voertuigList = new VoertuigList();

    public Methods() {

    }

    public void deleteVoertuig() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welke Voertuig wilt u verkopen?\n" +
                "Geef het voertuignummer op: ");
        //zodat er geen conflict is tussen scanner.nextInt() en nextLine()
        int voertuigNumber = scanner.nextInt();
        scanner.nextLine();
        voertuigList.deleteVoertuig(voertuigNumber);
    }



    // geen voertuig aanmaken maar een auto of een vliegtuig bij de gekozen keuze
    public void addVoertuig() {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Geef het voertuig op");
            String name = scanner.nextLine();
            System.out.println("Wat voor soort voertuig is het?");
            String soortVoertuig = scanner.nextLine();
            System.out.println("Geef het Gewicht op (KG)");
            double weight = scanner.nextDouble();
            System.out.println("Geef het aantal PK op");
            double aantalPk = scanner.nextDouble();
            if(soortVoertuig.equals("Vliegtuig") || soortVoertuig.equals("vliegtuig")){
                System.out.println("Wat voor type vliegtuig is het?");
                String TypeBoot = scanner.nextLine();
                Voertuig boot = new Bootje(name, soortVoertuig, aantalPk, weight, TypeBoot) {
                };

                voertuigList.addVoertuig(boot);
                System.out.println("Het voertuig is toegevoegd");
                System.out.println("Het voertuignummer is: " + boot.getVoertuignummer());
            }

            if(soortVoertuig.toLowerCase().equals("auto")){
                System.out.println("Wat voor type Auto is het?");
                String TypeAuto = scanner.nextLine();
                Voertuig auto = new Auto(name, soortVoertuig, aantalPk, weight, TypeAuto) {
                };

                voertuigList.addVoertuig(auto);
                System.out.println("Het voertuig is toegevoegd");
                System.out.println("Het voertuignummer is: " + auto.getVoertuignummer());
            }


        }
        catch (Exception e){
            System.out.println("Foute waarde! Probeer het opnieuw");
        }
    }

    public void displayVoertuigList () {
        ArrayList<Voertuig> voertuigen = voertuigList.getVoertuigen();
        System.out.println("Voertuignummer  |  Naam");
        for (int i = 0; i < voertuigen.size(); i++) {
            System.out.println(voertuigen.get(i).getVoertuignummer()+ ": " +voertuigen.get(i).getName());
        }
        if (voertuigen.size() == 0){
            System.out.println("U heeft nog geen voortuigen ter beschikking");
        }

    }



    public void getTopsnelheid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("van welke auto wilt u de topsnelheid weten?\n" +
                "geef het voertuignummer op:");
        int voertuigNumber = scanner.nextInt();
        double topsnelheid = voertuigList.getSpecifiekVoertuig(voertuigNumber).getTopsnelheid();
        Voertuig voertuig = voertuigList.getSpecifiekVoertuig(voertuigNumber);
        System.out.println(voertuig.getSoortVoertuig());
        System.out.println(topsnelheid + "km/h");
    }

    public void getWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("van welke auto wilt u de topsnelheid weten?\n" +
                "geef het voertuignummer op:");
        int voertuigNumber = scanner.nextInt();
        double weight = voertuigList.getSpecifiekVoertuig(voertuigNumber).getWeight();
        System.out.println(weight);
    }

    public void getSoortVoertuig() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("van welke auto wilt u de topsnelheid weten?\n" +
                "geef het voertuignummer op:");
        int voertuigNumber = scanner.nextInt();
        String soortVoertuig = voertuigList.getSpecifiekVoertuig(voertuigNumber).getSoortVoertuig();
        System.out.println(soortVoertuig);
    }


    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("van welke voertuig wilt u de info weten?");
        int voertuigNummer = scanner.nextInt();
        double aantalPk = voertuigList.getSpecifiekVoertuig(voertuigNummer).getAantalPk();
        double weight = voertuigList.getSpecifiekVoertuig(voertuigNummer).getWeight();
        String soortVoertuig = voertuigList.getSpecifiekVoertuig(voertuigNummer).getSoortVoertuig();
        System.out.println("Dit is een: " + soortVoertuig + "\nHet gewicht is: " + weight + "kg" +  "\nHet aantal pk is: " + aantalPk + "\nHet voertuignummer is: " + voertuigNummer);
    }

}
