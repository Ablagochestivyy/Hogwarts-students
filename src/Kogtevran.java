public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Kogtevran(String name,
                     String surname,
                     int smart,
                     int wise,
                     int witty,
                     int creativity,
                     int magicPower,
                     int transgression) {
        super(name, surname, magicPower, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran " +
                super.toString() +
                ", smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity;
    }
    public  int sum(){
        return getCreativity() + getSmart() + getWise() + getWitty();
    }
    public void compare (Kogtevran otherStudent){
        int thisPower = sum();
        int otherPower = otherStudent.sum();
        if (thisPower > otherPower){
            System.out.println(getName() + " " + getSurname() + " лучше Когтевранец, чем " + otherStudent.getName() + " " + otherStudent.getSurname());
        } else {System.out.println(otherStudent.getName() + " " + otherStudent.getSurname() + " лучше Когтевранец, чем " + getName() + " " + getSurname() );}
    }


    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
