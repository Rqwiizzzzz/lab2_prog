import ru.ifmo.se.pokemon.*;

public final class DrainingKiss extends SpecialMove {
    public DrainingKiss(){
        super(Type.FAIRY,50,100);
    }
    @Override
    protected void applySelfDamage(Pokemon attackingPokemon, double damage){
        int Heal = (int) (damage * 0.75);
        attackingPokemon.setMod(Stat.HP, -Heal);
    }
    @Override
    protected String describe(){
        return "использует Draining Kiss, нанося урон врагу и исцеляя себя";
    }
}
