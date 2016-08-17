/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import model.*;

/**
 *
 * @author Raffy
 */
public class ShapeFactory {

    public static MyShape createShape(String s, int x1, int y1, int x2, int y2) {
        MyShape shape = null;
        switch (s) {
            case "Rectangle":
                shape = new MyRectangle(x1, y1, x2, y2);
                break;
            case "Square":
                shape = new MySquare(x1, y1, x2, y2);
                break;
            case "Ellipse":
                shape = new MyEllipse(x1, y1, x2, y2);
                break;
            case "Circle":
                shape = new MyCircle(x1, y1, x2, y2);
                break;
            case "Line":
                shape = new MyLine(x1, y1, x2, y2);
                break;
            default:
                break;
        }

        return shape;
    }

}
