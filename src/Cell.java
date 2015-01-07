/**
 * Created by patrick on 07.01.15.
 */
public class Cell {

    private Shape s;
    private boolean isEmpty;

    public Cell(){
        isEmpty = true;
    }

    public void setShape(Shape s){
        this.s = s;
    }

    public Shape getShape(){
        return s;
    }

    public void setFull(){
        isEmpty = false;
    }

    public boolean getIsEmpty(){
        return isEmpty;
    }

}
