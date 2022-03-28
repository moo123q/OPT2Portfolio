import java.util.ArrayList;
import java.util.Scanner;
public class Methods {

    Scanner scanner = new Scanner(System.in);
    private VoertuigList voertuigList = new VoertuigList();

    public Methods() {

    }

    public void deleteVoertuig() {
        if(voertuigList.getVoertuigen().size() != 0) {
            System.out.print("Welke Voertuig wilt u verkopen?\n" +
                    "Geef het voertuignummer op: ");
            //zodat er geen conflict is tussen scanner.nextInt() en nextLine()
            int voertuigNumber = scanner.nextInt();
            scanner.nextLine();
            voertuigList.verwijderVoertuig(voertuigNumber);
        }

        else {
            System.out.println("U heeft nog geen voertuigen ter beschikking\nWilt u een voertuig toevoegen(ja/nee)?");
            String antwoord = scanner.nextLine();
            if (antwoord.toLowerCase().equals("ja")){
                addVoertuig();
            }
            else {
                System.out.println("Ga maar verder");
            }

        }
    }




    public void addVoertuig() {


        try {

            System.out.println("Geef het voertuig op");
            String name = scanner.nextLine();
            System.out.println("Wat voor soort voertuig is het?");
            String soortVoertuig = scanner.nextLine();
            while (!soortVoertuig.toLowerCase().equals("auto") && !soortVoertuig.toLowerCase().equals("boot")){
                System.out.println("Verkeerde invoer! probeer het opnieuw");
                System.out.println("Wat voor soort voertuig is het?");
                soortVoertuig = scanner.nextLine();
            }
            System.out.println("Geef het Gewicht op (KG)");
            double weight = scanner.nextDouble();
            System.out.println("Geef het aantal PK op");
            double aantalPk = scanner.nextDouble();
            System.out.println("Wat voor soort motor heeft het vroertuig?\nKerosine, Benzine of diesel?");
            Motorblok motorblok = new Motorblok(scanner.nextLine());
            motorblok.setSoortMotor(scanner.nextLine());
            if(soortVoertuig.toLowerCase().equals("boot")){
                System.out.println("Wat voor type boot is het?");
                String TypeBoot = scanner.nextLine();
                Voertuig boot = new Bootje(name, soortVoertuig, aantalPk, weight, motorblok,TypeBoot) {
                };

                voertuigList.addVoertuig(boot);
                System.out.println("Het voertuig is toegevoegd");
                System.out.println("Het voertuignummer is: " + boot.getVoertuignummer());
            }

            if(soortVoertuig.toLowerCase().equals("auto")){
                System.out.println("Wat voor type Auto is het?");
                String TypeAuto = scanner.nextLine();
                Voertuig auto = new Auto(name, soortVoertuig, aantalPk, weight, motorblok, TypeAuto) {
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
        System.out.println("van welke auto wilt u de topsnelheid weten?\n" +
                "geef het voertuignummer op:");
        int voertuigNumber = scanner.nextInt();
        double topsnelheid = voertuigList.getSpecifiekVoertuig(voertuigNumber).getTopsnelheid();
        Voertuig voertuig = voertuigList.getSpecifiekVoertuig(voertuigNumber);
        System.out.println(voertuig.getSoortVoertuig());
        System.out.println(topsnelheid + "km/h");
    }

    public void getWeight() {
        System.out.println("van welke auto wilt u de topsnelheid weten?\n" +
                "geef het voertuignummer op:");
        int voertuigNumber = scanner.nextInt();
        double weight = voertuigList.getSpecifiekVoertuig(voertuigNumber).getWeight();
        System.out.println(weight);
    }

    public void getSoortVoertuig() {
        System.out.println("van welke auto wilt u de topsnelheid weten?\n" +
                "geef het voertuignummer op:");
        int voertuigNumber = scanner.nextInt();
        String soortVoertuig = voertuigList.getSpecifiekVoertuig(voertuigNumber).getSoortVoertuig();
        System.out.println(soortVoertuig);
    }


    public void getInfo() {
        System.out.println("van welke voertuig wilt u de info weten?");
        int voertuigNummer = scanner.nextInt();
        double aantalPk = voertuigList.getSpecifiekVoertuig(voertuigNummer).getAantalPk();
        double weight = voertuigList.getSpecifiekVoertuig(voertuigNummer).getWeight();
        String soortVoertuig = voertuigList.getSpecifiekVoertuig(voertuigNummer).getSoortVoertuig();
        Motorblok mo = voertuigList.getSpecifiekVoertuig(voertuigNummer).getMotorblok();
        System.out.println("Dit is een: " + soortVoertuig + "\nHet gewicht is: " + weight + "kg" +  "\nHet aantal pk is: " + aantalPk + "\nHet voertuignummer is: " + voertuigNummer + "\ntest: " + mo.isZuinig());
    }

}
