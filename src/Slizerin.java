public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slizerin(String name,
                    String surname,
                    int cunning,
                    int determination,
                    int ambition,
                    int resourcefulness,
                    int thirstForPower,
                    int magicPower,
                    int transgression) {
        super(name, surname, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return "Slizerin " +
                super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower;
    }

    public  int sum(){
        return getAmbition() + getCunning() + getDetermination() + getResourcefulness();
    }
    public void compare (Slizerin otherStudent){
        int thisPower = sum();
        int otherPower = otherStudent.sum();
        if (thisPower > otherPower){
            System.out.println(getName() + " " + getSurname() + " лучше Слизеринец, чем " + otherStudent.getName() + " " + otherStudent.getSurname());
        } else {System.out.println(otherStudent.getName() + " " + otherStudent.getSurname() + " лучше Слизеринец, чем " + getName() + " " + getSurname() );}
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
