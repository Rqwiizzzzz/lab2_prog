import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Surskit p1 = new Surskit("Крут", 40);
        Jigglypuff p2 = new Jigglypuff("Супер", 40);
        TapuLele p3 = new TapuLele("умен",40);
        Igglybuff p4 = new Igglybuff("класс",40);
        Wigglytuff p5 = new Wigglytuff("красив",40);
        Masquerain p6 = new Masquerain("нуб",40);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}
