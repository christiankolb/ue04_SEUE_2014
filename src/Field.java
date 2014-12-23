/**
 * Created by patrick on 18.12.14.
 */


public class Field {

    private final int TOTAL_HEIGHT = 24;
    private final int HEIGHT = 20;
    private final int WIDTH = 10;
    private Cell[][] field;

    public Field(){
        field = new Cell[WIDTH][TOTAL_HEIGHT];
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

    public void setCell(Cell cell){
        field[cell.getX()][convertY(cell.getY())] = cell;
    }

    public void deleteFullRows(){
        boolean rowFull = false;
        for(int i = 0; i < HEIGHT; i++){
            for(int j = 0; j < WIDTH; j++){
                if(field[i][j] == null){
                    rowFull = false;
                    break;
                }else{
                    rowFull = true;
                }
            }
            if(rowFull){
                deleteRow(i);
            }
        }
        if(rowFull){
            moveUp();
        }
    }

    private void deleteRow(int row){
        for(int i = 0; i < WIDTH; i++){
            field[row][i] = null;
        }
    }

    /////////nachrücken von steinen -> wenn reihen gelöscht wurden
    private void moveUp(){
        boolean rowEmpty = false;
        for(int i = HEIGHT-1; i >= 0; i--){
            for(int j = 0; j < WIDTH; j++){
                if(field[i][j] != null){
                    rowEmpty = false;
                    break;
                }else{
                    rowEmpty = true;
                }
            }
            if(rowEmpty){

            }
        }
    }

    private int convertY(int y){
        return TOTAL_HEIGHT - y;
    }

}
