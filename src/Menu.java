import java.util.ArrayList;
import java.util.Scanner;



public class Menu
{

    private Methods methods = new Methods();


    public Menu() {

    }

    public void startApplication()
    {
        Scanner scanner = new Scanner(System.in);

        //dit print de lijst van keuzes die de gebruiker kan maken.
        System.out.println(
                "\n1) Lijst met voertuigen en info\n" +
                        "2) Nieuwe Voertuig inschrijven\n" +
                        "3) Voertuig Verkopen\n" +
                        "4) Topsnelheid\n" +
                        "5) Informatie van de auto's opvragen\n" +
                        "0) Exit\n");;

        System.out.print("Uw keuze: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice == 1) {
            methods.displayVoertuigList();
        }
        if(choice == 2) {

            methods.addVoertuig();
        }
        if(choice == 3) {

            methods.deleteVoertuig();
        }

        if(choice == 4) {

            methods.getTopsnelheid();
        }

        if(choice == 5) {
            methods.getInfo();
        }


        if(choice == 0)
        {
            System.exit(0);
        }
        startApplication();
    }
}