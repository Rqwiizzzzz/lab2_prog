import ru.ifmo.se.pokemon.*;

public final class CalmMind extends StatusMove {
    public CalmMind(){
        super(Type.PSYCHIC, 0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, 1);
        p.setMod(Stat.SPECIAL_DEFENSE, 1);
    }
    @Override
    protected String describe(){
        return "Познал дзен и повысил свою спец.защиту и спец.атаку (CalmMind)";
    }
}
