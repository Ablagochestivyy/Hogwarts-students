public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private  int transgression;

    public Hogwarts(String name, String surname, int magicPower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
