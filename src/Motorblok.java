public class Motorblok {
    private String soortMotor;


    public Motorblok(String soortMotor) {
        this.soortMotor = soortMotor;
    }

    public String getSoortMotor() {
        return soortMotor;
    }

    public void setSoortMotor(String soortMotor) {
        this.soortMotor = soortMotor;
    }

    public String isZuinig() {
        if (soortMotor.toLowerCase().equals("diesel")) {
            return "Dit voertuig is zuinig";
        }
        else {
            return "Dit voertuig is niet zuinig";
        }

    }


}
