/**
 * Created by patrick on 22.12.14.
 */
public abstract class Block {

    protected Cell[] cell;
    protected int rotation = 0;

    public abstract boolean rotateRight(Field field);
    public abstract boolean rotateLeft(Field field);

    public boolean moveRight(Field field) {
        for(int i = 0; i < cell.length; i++){
            cell[i].setX(cell[i].getX()+1);
        }
        if(!field.isNewPositionValid(cell)){
            for(int i = 0; i < cell.length; i++){
                cell[i].setX(cell[i].getX()-1);
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean moveLeft(Field field) {
        for(int i = 0; i < cell.length; i++){
            cell[i].setX(cell[i].getX()-1);
        }
        if(!field.isNewPositionValid(cell)){
            for(int i = 0; i < cell.length; i++) {
                cell[i].setX(cell[i].getX()+1);
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean moveDown(Field field) {
        for(int i = 0; i < cell.length; i++){
            cell[i].setY(cell[i].getY()-1);
        }
        if(!field.isNewPositionValid(cell)){
            for(int i = 0; i < cell.length; i++){
                cell[i].setY(cell[i].getY()+1);
            }
            return true;
        }else{
            return false;
        }
    }

    public void finalizeBlock(Field field){
        for(int i = 0; i < cell.length; i++){
            field.setCell(cell[i]);
        }
        field.deleteFullRows();
    }

}
