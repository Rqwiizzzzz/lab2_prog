import ru.ifmo.se.pokemon.*;
public final class TapuLele extends Pokemon {
    public TapuLele(String name, int level){
        super(name,level);
        setType(Type.PSYCHIC,Type.FAIRY);
        setStats(70,85,75,130,115,95);
        addMove(new DrainingKiss());
        addMove(new Thunderbolt());
        addMove(new CalmMind());
        addMove(new Psywave());
    }

}
