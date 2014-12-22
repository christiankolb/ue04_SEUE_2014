/**
 * Created by patrick on 18.12.14.
 */

// field 10*24, 10*20 effektiv nutzbar

public class Feld {

    private final int TOTAL_HEIGHT = 24;
    private final int HEIGHT = 20;
    private final int WIDTH = 10;
    private Stein[][] field;

    public Feld(){

        field = new Stein[10][24];
    }
}
