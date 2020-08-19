package sample;
import javafx.scene.shape.*;


public class Controller {
    public static final int MOVE = Main.blockMove;
    public static final int SIZE = Main.blockSize;
    public static int XMAX = Main.xMax;
    public static int YMAX = Main.yMax;
    public static int [][] BOARD = Main.tetrisBoard;

    public static void moveRight(Form form){
        if(form.a.getX() + MOVE <= XMAX - SIZE && form.b.getX() + MOVE <= XMAX - SIZE
        && form.c.getX() + MOVE <= XMAX - SIZE && form.d.getX() + MOVE <= XMAX - SIZE){
            int movea = BOARD[((int) form.a.getX()/SIZE) + 1][((int) form.a.getY()/SIZE)];
            int moveb = BOARD[((int) form.b.getX()/SIZE) + 1][((int) form.b.getY()/SIZE)];
            int movec = BOARD[((int) form.c.getX()/SIZE) + 1][((int) form.c.getY()/SIZE)];
            int moved = BOARD[((int) form.d.getX()/SIZE) + 1][((int) form.d.getY()/SIZE)];
            if(movea == 0 && movea == moveb && moveb == movec && movec == moved){
                form.a.setX(form.a.getX() + MOVE);
                form.b.setX(form.b.getX() + MOVE);
                form.c.setX(form.c.getX() + MOVE);
                form.d.setX(form.d.getX() + MOVE);
            }

        }
    }
    public static void moveLeft(Form form){
        if(form.a.getX() + MOVE <= XMAX - SIZE && form.b.getX() + MOVE <= XMAX - SIZE
                && form.c.getX() + MOVE <= XMAX - SIZE && form.d.getX() + MOVE <= XMAX - SIZE){
            int movea = BOARD[((int) form.a.getX()/SIZE) - 1][((int) form.a.getY()/SIZE)];
            int moveb = BOARD[((int) form.b.getX()/SIZE) - 1][((int) form.b.getY()/SIZE)];
            int movec = BOARD[((int) form.c.getX()/SIZE) - 1][((int) form.c.getY()/SIZE)];
            int moved = BOARD[((int) form.d.getX()/SIZE) - 1][((int) form.d.getY()/SIZE)];
            if(movea == 0 && movea == moveb && moveb == movec && movec == moved){
                form.a.setX(form.a.getX() - MOVE);
                form.b.setX(form.b.getX() - MOVE);
                form.c.setX(form.c.getX() - MOVE);
                form.d.setX(form.d.getX() - MOVE);
            }

        }
    }

    public static  Form makeRect(){
        int block = (int)(Math.random() * 100);
        //How to debug :3
        System.out.println(block);
        String name;
        Rectangle a = new Rectangle(SIZE-1,SIZE - 1),
                b = new Rectangle(SIZE-1,SIZE - 1),
                c = new Rectangle(SIZE-1,SIZE - 1),
                d = new Rectangle(SIZE-1,SIZE - 1);
        if (block < 15) {
            a.setX(XMAX / 2 - SIZE);
            b.setX(XMAX / 2 - SIZE);
            b.setY(SIZE);
            c.setX(XMAX / 2);
            c.setY(SIZE);
            d.setX(XMAX / 2 + SIZE);
            d.setY(SIZE);
            name = "j";
        } else if (block < 30) {
            a.setX(XMAX / 2 + SIZE);
            b.setX(XMAX / 2 - SIZE);
            b.setY(SIZE);
            c.setX(XMAX / 2);
            c.setY(SIZE);
            d.setX(XMAX / 2 + SIZE);
            d.setY(SIZE);
            name = "l";
        } else if (block < 45) {
            a.setX(XMAX / 2 - SIZE);
            b.setX(XMAX / 2);
            c.setX(XMAX / 2 - SIZE);
            c.setY(SIZE);
            d.setX(XMAX / 2);
            d.setY(SIZE);
            name = "o";
        } else if (block < 60) {
            a.setX(XMAX / 2 + SIZE);
            b.setX(XMAX / 2);
            c.setX(XMAX / 2);
            c.setY(SIZE);
            d.setX(XMAX / 2 - SIZE);
            d.setY(SIZE);
            name = "s";
        } else if (block < 75) {
            a.setX(XMAX / 2 - SIZE);
            b.setX(XMAX / 2);
            c.setX(XMAX / 2);
            c.setY(SIZE);
            d.setX(XMAX / 2 + SIZE);
            name = "t";
        } else if (block < 90) {
            a.setX(XMAX / 2 + SIZE);
            b.setX(XMAX / 2);
            c.setX(XMAX / 2 + SIZE);
            c.setY(SIZE);
            d.setX(XMAX / 2 + SIZE + SIZE);
            d.setY(SIZE);
            name = "z";
        } else {
            a.setX(XMAX / 2 - SIZE - SIZE);
            b.setX(XMAX / 2 - SIZE);
            c.setX(XMAX / 2);
            d.setX(XMAX / 2 + SIZE);
            name = "i";
        }
       return new Form(a,b,c,d,name);
    }
}
