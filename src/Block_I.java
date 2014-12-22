/**
 * Created by patrick on 22.12.14.
 */
public class Block_I extends Block{


    @Override
    public boolean rotateRight(Field field) {
        if(field.isNewPositionValid(cell)){
            //rotate right
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean rotateLeft(Field field) {
        if(field.isNewPositionValid(cell)){
            //rotate left
            return true;
        }else{
            return false;
        }
    }
}
