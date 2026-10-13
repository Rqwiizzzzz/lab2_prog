import ru.ifmo.se.pokemon.*;

public final class Psywave extends SpecialMove {
    private int attacker_level;
    public Psywave(){
        super(Type.PSYCHIC,1,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        attacker_level = p.getLevel();
    }
    @Override
    protected void applyOppDamage(Pokemon defender, double damage){
        double Multiplier = 0.5 + Math.random();
        damage = attacker_level * Multiplier;
        super.applyOppDamage(defender, damage);
    }
    @Override
    protected String describe(){
        return "Наносит ментальный удар (Psywave)";
    }
}
