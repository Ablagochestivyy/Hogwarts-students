public class Puffendui extends  Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public  Puffendui(String name, String surname, int hardworking, int loyal, int honest,  int magicPower, int transgression){
        super(name, surname, magicPower, transgression);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
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
