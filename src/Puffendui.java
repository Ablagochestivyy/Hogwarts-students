public class Puffendui extends  Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public  Puffendui(String name,
                      String surname,
                      int hardworking,
                      int loyal,
                      int honest,
                      int magicPower,
                      int transgression){
        super(name, surname, magicPower, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    @Override
    public String toString() {
        return "Puffendui " +
                super.toString() +
                ", hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest;
    }

    public  int sum(){
        return getHardworking() + getHonest() + getLoyal();
    }
    public void compare (Puffendui otherStudent){
        int thisPower = sum();
        int otherPower = otherStudent.sum();
        if (thisPower > otherPower){
            System.out.println(getName() + " " + getSurname() + " лучше Пуфендуец, чем " + otherStudent.getName() + " " + otherStudent.getSurname());
        } else {System.out.println(otherStudent.getName() + " " + otherStudent.getSurname() + " лучше Пуфендуец, чем " + getName() + " " + getSurname() );}
    }

    public int getHardworking(){
        return hardworking;
    }

    public void setHardworking(int hardworking){
        this.hardworking = hardworking;
    }

    public  int getLoyal(){
        return loyal;
    }

    public void setLoyal(int loyal){
        this.loyal = loyal;
    }

    public int getHonest(){
        return honest;
    }
    public  void setHonest(int honest){
        this.honest = honest;
    }
}
