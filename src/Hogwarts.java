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

    @Override
    public String toString() {
        return name + " " + surname +
                ": magicPower=" + magicPower +
                ", transgression=" + transgression;
    }

    public void compare(Hogwarts otherStudent){
        if (getMagicPower() > otherStudent.getMagicPower()){
            System.out.println(getName() + " " + getSurname() + " лучше студент, чем " + otherStudent.getName() + " " + otherStudent.getSurname());
        }else {
            System.out.println(otherStudent.getName() + " " + otherStudent.getSurname() + " лучше студент, чем " + getName() + " " + getSurname());
        }
    }

    public String getName() {return name;}

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
