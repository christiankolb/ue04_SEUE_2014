/**
 * Created by patrick on 22.12.14.
 */
public class Block_J extends Block {

    public Block_J() {
        squares = new boolean[3][3];
        squares[0][0] = false;
        squares[0][1] = true;
        squares[0][2] = false;
        squares[1][0] = false;
        squares[1][1] = true;
        squares[1][2] = false;
        squares[2][0] = true;
        squares[2][1] = true;
        squares[2][2] = false;
    }
}
