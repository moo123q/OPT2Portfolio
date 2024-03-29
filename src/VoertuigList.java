import java.util.ArrayList;

class VoertuigList {
    private ArrayList<Voertuig> voertuigen;

    public VoertuigList() {
        voertuigen = new ArrayList<Voertuig>();
    }


    public ArrayList<Voertuig> getVoertuigen() {
        return voertuigen;
    }

    public Voertuig getSpecifiekVoertuig(int voertuigNumber) {
        for (int i = 0; i < voertuigen.size(); i++) {
            int voertuigNum = voertuigen.get(i).getVoertuignummer();
            if (voertuigNumber == voertuigNum) {
                return voertuigen.get(i);
            }
        }
        return null;
    }


    public void verwijderVoertuig(int voertuigNumber) {

        for (int i = 0; i < voertuigen.size(); i++) {
            int voertuig = voertuigen.get(i).getVoertuignummer();
            if (voertuig == voertuigNumber) {
                System.out.println(getSpecifiekVoertuig(voertuigNumber).getName() + " is verkocht!");
                voertuigen.remove(i);
                return;
            }
        }
        System.out.printf("voertuig %d was not found!\n", voertuigNumber);
    }

    public void addVoertuig(Voertuig voertuig) {

        voertuigen.add(voertuig);
    }
}