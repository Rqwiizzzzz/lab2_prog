import ru.ifmo.se.pokemon.*;

public final class DreamEater extends SpecialMove {
    private boolean isAsleep;
    public DreamEater(){
        super(Type.PSYCHIC,100,100);
    }
    @Override
    protected void applyOppDamage(Pokemon defender, double damage){
        isAsleep = defender.getCondition() == Status.SLEEP;
        if (isAsleep){
            super.applyOppDamage(defender,damage);
        }
        else{
            super.applyOppDamage(defender,0);
        }
    }
    @Override
    protected void applySelfDamage(Pokemon attacker, double damage){
        if (isAsleep){
            int Heal = (int) (damage * 0.5);
            attacker.setMod(Stat.HP, -Heal);
        }
    }
    @Override
    protected String describe(){
        return "Пожирает сны (Dream Eater)";
    }
}
