import java.awt.Point;
import java.util.Date;

import javax.swing.text.Position;

public class Main {
    public static void main(String[] args) {
        Point point5 = new Point(5,5);
        Point point6 = point5;
        point5.x = 4;
        System.out.println(point6);

    }    
    
}
