import ru.ifmo.se.pokemon.*;
public final class Wigglytuff extends Jigglypuff{
    public Wigglytuff(String name, int level){
        super(name,level);
        setType(Type.NORMAL, Type.FAIRY);
        setStats(140,70,45,85,50,45);
        addMove(new DoubleSlap());
    }
}
