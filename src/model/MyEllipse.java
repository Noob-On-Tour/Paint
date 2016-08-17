package model;

import java.awt.*;
import java.awt.Point;

public class MyEllipse extends MyShape {

    public static int counter = 0;

    public MyEllipse(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        width = Math.abs(x2 - x1);
        height = Math.abs(y2 - y1);
        counter++;
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(Math.min(x1, x2), Math.min(y1, y2), width, height);// TODO Auto-generated method stub
        if (fillColor != null) {
            g.setColor(fillColor);
            g.fillOval(Math.min(x1, x2), Math.min(y1, y2), width, height);
        }
    }

    @Override
    public boolean creation(Point p, boolean clicked) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void select() {
        // TODO Auto-generated method stub

    }

    @Override
    public void deSelect() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isSelected() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isFilled() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setFilled(boolean b) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getLineThickness() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setLineThickness(int thickness) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isMovepoint(Point point) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int isResizepoint(Point Point) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Point getMovePoint() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ShapeInterface copy() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean intialized() {
        // TODO Auto-generated method stub
        return false;
    }

}
