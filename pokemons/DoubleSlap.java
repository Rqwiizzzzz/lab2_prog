import ru.ifmo.se.pokemon.*;

public final class DoubleSlap extends PhysicalMove {
    public DoubleSlap(){
        super(Type.NORMAL,15,85);
    }
    @Override
    protected void applyOppDamage(Pokemon defender, double damage){
        int hits = (int) (Math.random() * 4 + 2);
        for (int i =0; i < hits; i++){
            super.applyOppDamage(defender, damage);
        }
    }
    @Override
    protected String describe(){
        return "Шлепает врага (Double Slap)";
    }
}
