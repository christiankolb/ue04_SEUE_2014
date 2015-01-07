/**
 * Created by patrick on 22.12.14.
 */
public class Block_T extends Block {

    public Block_T() {
        squares = new boolean[3][3];
        squares[0][0] = true;
        squares[0][1] = true;
        squares[0][2] = true;
        squares[1][0] = false;
        squares[1][1] = true;
        squares[1][2] = false;
        squares[2][0] = false;
        squares[2][1] = false;
        squares[2][2] = false;
    }

}
