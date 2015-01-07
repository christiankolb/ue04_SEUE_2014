/**
 * Created by patrick on 22.12.14.
 */
public class Block_O extends Block {

    public Block_O(){
        squares = new boolean[2][2];
        squares[0][0] = true;
        squares[0][1] = true;
        squares[1][0] = true;
        squares[1][1] = true;
    }

    @Override
    public boolean rotateRight() {
        return true;
    }

    @Override
    public boolean rotateLeft() {
        return true;
    }
}
