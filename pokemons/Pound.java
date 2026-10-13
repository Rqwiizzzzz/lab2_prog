import ru.ifmo.se.pokemon.*;

public final class Pound extends PhysicalMove {
    public Pound(){
        super(Type.NORMAL,40,100);
    }
    @Override
    protected String describe(){
        return "Наносит физ. урон (Pound)";
    }
}
