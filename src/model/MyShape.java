package model;

import java.awt.*;
import java.awt.geom.Line2D;
import java.util.*;

public abstract class MyShape implements ShapeInterface {

    protected Color color;
    protected int x1, y1, x2, y2;
    int width = x2 - x1;
    int height = y2 - y1;
    Color fillColor = null;
    String name;
    String type;
    int x[] = new int[3];
    int y[] = new int[3];
    int Centerx, Centery;

    protected int lineSize;
    protected boolean isFilled;
    protected boolean isSelected;
    protected int selectPointRadius = 20;
    boolean initialize;
    protected ArrayList<Point> points;
    protected ArrayList<Point> movePoints;
    protected ArrayList<Point> resizePoints;

    public MyShape(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public MyShape(int x1, int x2, int x3, int y1, int y2, int y3) {
        x[0] = x1;
        x[1] = x2;
        x[2] = x3;
        y[0] = y1;
        y[1] = y2;
        y[2] = y3;
    }

    public int getCenterx() {
        return Centerx;
    }

    public int getCentery() {
        return Centery;
    }

    public void paint(Graphics g) {

    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setFillColor(Color c) {
        fillColor = c;
    }

    public boolean isOnLine(Point a, Point b, Point c) {
        if ((Line2D.ptSegDist(a.getX(), a.getY(), b.getX(), b.getY(), c.getX(), c.getY()) != 0)) {
            return false;
        }
        return true;
    }

    public String getType() {
        return this.type;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public Point getMovePoint() {
        return movePoints.get(0);
    }

    public boolean isInitialized() {
        return initialize;
    }

    @Override
    public boolean contains(Point p) {
        int x = (int) p.getX();
        int y = (int) p.getY();
        if (x < Math.max(x2, x1) && x > Math.min(x2, x1) && y > Math.min(y2, y1) && y < Math.max(y1, y2)) {
            return true;
        }
        return false;

    }

    @Override
    public void respondToMove(Point p1, Point p2) {
        int xShift = (int) (p2.getX() - p1.getX());
        int yShift = (int) (p2.getY() - p1.getY());
        x1 += xShift;
        x2 += xShift;
        y1 += yShift;
        y2 += yShift;

    }

    public int getArea() {
        return width * height;
    }

    public void respondToResize(Point a, Point b) {
        width += (int) (b.getX() - a.getX());
        height += (int) (b.getY() - a.getY());
    }

    @Override
    public boolean creation(Point p, boolean clicked) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void select() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deSelect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isSelected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFilled() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFilled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLineThickness() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLineThickness(int thickness) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isMovepoint(Point point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int isResizepoint(Point Point) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ShapeInterface copy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean intialized() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getXT1() {
        return x[0];
    }

    public int getXT2() {
        return x[1];
    }

    public int getXT3() {
        return x[2];
    }

    public int getYT1() {
        return y[0];
    }

    public int getYT2() {
        return y[1];
    }

    public int getYT3() {
        return y[2];
    }

    public void setType(String s) {
        type = s;
    }

    public void setwidth(int dis) {//modified
        this.width = dis;
    }

    public void setheight(int dis) {
        this.height = dis;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {//modified
        return height;
    }
}
