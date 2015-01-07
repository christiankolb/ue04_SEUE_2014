/**
 * Created by patrick on 18.12.14.
 */
public class GameApp {

    public static void main(String[] args){

        boolean gameOver = false;
        Field field = new Field();

        BlockHandler handler = new BlockHandler(field);

            handler.spawnNewBlock();



    printBoard(field);

    }

    static void printBoard(Field field){
        for(int i = 0; i < 24; i++){
            for(int j = 0; j < 10; j++){
                if(field.isCellEmpty(i,j)){
                    System.out.print("|_");
                }else{
                    System.out.print("|x");
                }
            }
            System.out.println("|");
        }
    }

}
