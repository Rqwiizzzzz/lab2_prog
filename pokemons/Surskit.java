import ru.ifmo.se.pokemon.*;

public class Surskit extends Pokemon {
    public Surskit(String name, int level){
        super(name,level);
        setType(Type.BUG, Type.WATER);
        setStats(40,30,32,50,52,65);
        addMove(new ShadowBall());
        addMove(new Confide());
        addMove(new Swagger());
    }
}
