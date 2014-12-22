/**
 * Created by patrick on 18.12.14.
 */


public class Field {

    private final int TOTAL_HEIGHT = 24;
    private final int HEIGHT = 20;
    private final int WIDTH = 10;
    private Cell[][] field;

    public Field(){

        field = new Cell[10][24];
    }

    public boolean isNewPositionValid(Cell[] cell){
        for(int i = 0; i < cell.length; i++){
            if(!isCellInsideField(cell[i])){
                return false;
            }

            if(field[cell[i].getX()][convertY(cell[i].getY())] != null){
                return false;
            }
        }
        return true;
    }

    private boolean isCellInsideField(Cell cell){
        if(cell.getX() < 0 || cell.getX() > 9 || convertY(cell.getY()) < 0){
            return false;
        }else{
            return true;
        }
    }

    private int convertY(int y){
        return TOTAL_HEIGHT - y;
    }

}
