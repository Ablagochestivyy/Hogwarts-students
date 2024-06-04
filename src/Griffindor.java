public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor( String name,
                       String surname,
                       int nobility,
                       int honor,
                       int bravery,
                       int magicPower,
                       int transgression) {
        super(name, surname, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Griffindor " +
                super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }


    public  int sum(){
     return getBravery() + getHonor() + getNobility();
    }
    public void compare (Griffindor otherStudent){
        int thisPower = sum();
        int otherPower = otherStudent.sum();
        if (thisPower > otherPower){
            System.out.println(getName() + " " + getSurname() + " лучше Гинфедрочец, чем " + otherStudent.getName() + " " + otherStudent.getSurname());
        } else {System.out.println(otherStudent.getName() + " " + otherStudent.getSurname() + " лучше Гинфедрочец, чем " + getName() + " " + getSurname() );}
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }


}
