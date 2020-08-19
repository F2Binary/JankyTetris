package sample;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/* Example let a T piece be defined by
      a
     bdc
*/
public class Form {
    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Color color;
    private String name;
    private int form = 1;
    //Default constructor
    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d,String name){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;
        switch(name){
            case "j":
                color = Color.BLUE;
                break;
            case "i":
                color = Color.LIGHTBLUE;
                break;
            case "l":
                color = Color.ORANGE;
                break;
            case "T":
                color = Color.PURPLE;
                break;
            case "o":
                color = Color.CYAN;
                break;
            case "z":
                color = Color.RED;
                break;
        }
        this.a.setFill(color);
        this.b.setFill(color);
        this.c.setFill(color);
        this.d.setFill(color);
    }
    public String getName(){
        return name;
    }
    // We let each piece have four total rotations before they reach their original from.
    public void changeForm(){
        if(form != 4){
            form++;
        }
        else {
            form = 1;
        }

    }
}
