package model;

import java.awt.Point;

public class MyCircle extends MyEllipse {

    public static int counter = 0;

    public MyCircle(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);// TODO Auto-generated constructor stub
        super.width = super.height = Math.abs(x2 - x1);
        counter++;
    }

    @Override
    public boolean creation(Point p, boolean clicked) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void respondToResize(Point a, Point b) {
        width += (int) (b.getX() - a.getX());
        height += (int) (b.getX() - a.getX());
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
