/**
 * Created by patrick on 22.12.14.
 */
public class Cell {

    private int x;
    private int y;
    private Shape shape;

    public Cell(Shape shape){
        this.shape = shape;
    }

    public Shape getShape(){
        return this.shape;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }




}
