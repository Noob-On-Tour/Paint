package model;

import java.awt.*;
import java.awt.Point;

public class MyTriangle extends MyShape {

    public static int counter = 0;

    public MyTriangle(int x1, int x2, int x3, int y1, int y2, int y3) {
        super(x1, x2, x3, y1, y2, y3);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.drawPolygon(x, y, 3);
        if (fillColor != null) {
            g.setColor(fillColor);
            g.fillPolygon(x, y, 3);
        }// TODO Auto-generated method stub

    }

    @Override
    public void respondToMove(Point p1, Point p2) {
        int xShift = (int) (p2.getX() - p1.getX());
        int yShift = (int) (p2.getY() - p1.getY());
        x[0] += xShift;
        x[1] += xShift;

        x[2] += xShift;
        y[0] += yShift;
        y[1] += yShift;

        y[2] += yShift;

    }

    float sign(Point p1, Point p2, Point p3) {
        return (float) ((p1.getX() - p3.getX()) * (p2.getY() - p3.getY()) - (p2.getX() - p3.getX()) * (p1.getY() - p3.getY()));
    }

    boolean PointInTriangle(Point pt, Point v1, Point v2, Point v3) {
        boolean b1, b2, b3;

        b1 = sign(pt, v1, v2) < 0.0f;
        b2 = sign(pt, v2, v3) < 0.0f;
        b3 = sign(pt, v3, v1) < 0.0f;

        return ((b1 == b2) && (b2 == b3));
    }

    @Override
    public boolean contains(Point p) {
        Point a = new Point(x[0], y[0]), b = new Point(x[1], y[1]), c = new Point(x[2], y[2]);

        boolean x = PointInTriangle(p, a, b, c);
        return x;
    }

    @Override
    public void respondToResize(Point a, Point b) {
        x[0] += b.getX() - a.getX();
        x[1] += b.getX() - a.getX();
        y[0] += b.getY() - a.getY();
        y[1] += b.getY() - a.getY();

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
