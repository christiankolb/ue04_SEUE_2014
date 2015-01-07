import java.util.Random;

/**
 * Created by patrick on 18.12.14.
 */
public class BlockHandler {

    private Random rand;
    private boolean gameOver;
    private int randomNum;
    private final int MAX = 6;
    private final int MIN = 0;
    private Field field;

    public BlockHandler(Field field){
        this.gameOver = false;
        this.rand = new Random();
        this.field = field;
    }

    public void spawnNewBlock(){
        Block_I i = new Block_I();
    }

    // spawnen von Steinen (while != gameover)

    // bewegen von aktuellem Stein

    // drehen von aktuellem Stein

    // checken ob gameover


    //for random block
    private int randomNumber(){
        randomNum = rand.nextInt((MAX-MIN) + 1) + MIN;
        return randomNum;
    }

}
