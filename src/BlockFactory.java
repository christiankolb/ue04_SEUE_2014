/**
 * Created by patrick on 07.01.15.
 */
public class BlockFactory {

    public BlockFactory() {}


    //erzeugt die entsprechenden Blöcke
    public Block createNewBlock(int shape){

        switch(shape){
            case 0:
                return new Block_I();
            case 1:
                return new Block_J();
            case 2:
                return new Block_L();
            case 3:
                return new Block_O();
            case 4:
                return new Block_S();
            case 5:
                return new Block_T();
            case 6:
                return new Block_Z();
            default:
                return null;
        }
    }
}
