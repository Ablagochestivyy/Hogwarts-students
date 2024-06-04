//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Griffindor  hary= new Griffindor("Гари", "Поттер", 100, 100, 100, 92, 4000);
        Griffindor  hermiona= new Griffindor("Гермиона", "Грейнджер", 85, 90, 90, 85, 2700);
        Griffindor ron= new Griffindor("Рон", "Уизли", 100, 100, 100, 92, 1569);

        Puffendui zahariya= new Puffendui("Захария", "Смит", 95, 78,85, 54, 1298);
        Puffendui sedrik= new Puffendui("Седрик", "Диггори", 95, 78,85, 54, 1298);
        Puffendui djastin= new Puffendui("Джастин", "Финч-Флетчли", 75, 49,83, 74, 2145);

        Kogtevran jou= new Kogtevran("Чжоу", "Чанг", 59, 83, 96, 92, 70, 3564);
        Kogtevran padma= new Kogtevran("Падма", "Патил", 86, 84, 21, 35, 85, 2967);
        Kogtevran markus= new Kogtevran("Маркус", "Белби", 98, 89,78,85, 90, 3864);

        Slizerin drako= new Slizerin("Драко", "Малфой", 89, 98, 88, 95, 100, 87, 3200);
        Slizerin montegu= new Slizerin("Грэхэм", "Монтегю", 65, 78, 81, 59, 75, 72, 2763);
        Slizerin goil= new Slizerin("Гойл", "Грегори", 28, 94, 46, 75, 69, 57, 2489);

        ron.compare(hermiona);
        zahariya.compare(sedrik);
        jou.compare(markus);
        drako.compare(goil);

        djastin.compare(hary);
        padma.compare(montegu);
    }
}