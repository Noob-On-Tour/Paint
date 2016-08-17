package model;

import java.awt.*;

public class MyLine extends MyShape {

    public static int counter = 0;

    public MyLine(int x1, int y1, int x2, int y2) {
        super(x1, y1, x2, y2);
        counter++;
    }

    @Override

    public void paint(Graphics g) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

    public void setStart(int x1, int y1) {
        this.setX1(x1);
        this.setY1(y1);
    }

    public void setEnd(int x2, int y2) {
        this.setX2(x2);
        this.setY2(y2);
    }

    public void setColor(Color c) {
        this.color = c;
    }

    @Override
    public boolean contains(Point p) {
        Point a = new Point(x1, y1), c = new Point(x2, y2);
        double lenAb, lenBc, lenAc;
        lenAb = Math.sqrt((Math.pow(a.getX() - p.getX(), 2)) + (Math.pow(a.getY() - p.getY(), 2)));
        lenBc = Math.sqrt((Math.pow(p.getX() - c.getX(), 2)) + (Math.pow(p.getY() - c.getY(), 2)));
        lenAc = Math.sqrt((Math.pow(a.getX() - c.getX(), 2)) + (Math.pow(a.getY() - c.getY(), 2)));
        double value = lenAb + lenBc - lenAc;
        return Math.abs(value) < 0.01;
    }

    @Override
    public void respondToResize(Point a, Point b) {
        x1 += b.getX() - a.getX();
        y1 += b.getY() - a.getY();

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
