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

    public boolean isZuinig() {
        if (!soortMotor.toLowerCase().equals("diesel")) {
            return false;
        }
        return true;
    }
}
