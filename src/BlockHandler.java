import java.util.Random;

/**
 * Created by patrick on 18.12.14.
 */
public class BlockHandler {


    /*
    hat eine Blockfactory
    ist für spawnen und bewegen der steine verantwortlich

     */
    private Random rand;
    private boolean gameOver;
    private int randomNum;
    private final int MAX = 6;
    private final int MIN = 0;
    private Field field;

   /* public BlockHandler(Field field){
        this.gameOver = false;
        this.rand = new Random();
        this.field = field;
    }*/


    // spawnen von Steinen (while != gameover)

    // random bewegen von aktuellem Stein

    // random drehen von aktuellem Stein

    // checken ob gameover


    //for random block
    private int randomNumber(){
        randomNum = rand.nextInt((MAX-MIN) + 1) + MIN;
        return randomNum;
    }

}
