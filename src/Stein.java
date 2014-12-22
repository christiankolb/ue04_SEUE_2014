/**
 * Created by patrick on 22.12.14.
 */
public abstract class Stein {

    private Quadrat[] quadrate;
    private int ausrichtung = 0;

    public abstract boolean bewegungR();

    public abstract boolean bewegungL();

    public abstract boolean bewegungAbw();

    public abstract boolean drehungR();

    public abstract boolean drehungL();

}
