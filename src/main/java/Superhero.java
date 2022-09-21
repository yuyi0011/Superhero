public class Superhero {
    private String name;
    private String realName;
    private boolean humanStatus;
    private String superPower;
    private int creationsYear;
    private double strength;

    public Superhero ( String name, String realName, boolean humanStatus,String superPower,int creationsYear, double strength ){
        this.name=name;
       this.realName=realName;
      this.creationsYear=creationsYear;
        this.superPower=superPower;
       this.strength=strength;
       this.humanStatus=humanStatus;
    }
    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public int getCreationsYear() {
        return creationsYear;
    }
    // human status
    public boolean getHumanStatus() {
        return humanStatus;

        }


    public String getSuperPower() {
        return superPower;
    }

    public double getStrength() {
        return strength;
    }


}

