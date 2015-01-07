/**
 * Created by patrick on 22.12.14.
 */
public abstract class Block {

    protected boolean[][] squares;
    protected int rotation = 0;

    public boolean moveRight(){
        return false;
    }

    public boolean moveLeft(){
        return true;
    }

    public boolean moveDown(){
        return true;
    }

    public boolean rotateRight(){
        return true;
    }

    public boolean rotateLeft(){
        return true;
    }



    /////////// zum anregungen holen /////////

  /*  public boolean moveRight(Field field) {
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

    protected void setCoordinates(int cellNo, int x, int y){
        cell[cellNo].setX(x);
        cell[cellNo].setY(y);
    }
    */

}
