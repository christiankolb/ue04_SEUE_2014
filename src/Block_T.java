/**
 * Created by patrick on 22.12.14.
 */
public class Block_T extends Block {

    public Block_T(){
        block = new boolean[3][3];
        block[0][0] = true;
        block[0][1] = true;
        block[0][2] = true;
        block[1][0] = false;
        block[1][1] = true;
        block[1][2] = false;
        block[2][0] = false;
        block[2][1] = false;
        block[2][2] = false;
    }

}
