package model;

import java.awt.*;

public interface ShapeInterface {

    void paint(Graphics g);

    boolean contains(Point p);

    void respondToMove(Point p1, Point p2);

    void respondToResize(Point newPoint, Point oldPoint);

    boolean creation(Point p, boolean clicked);

    void select();

    void deSelect();

    boolean isSelected();

    void setColor(Color c);

    Color getColor();

    boolean isFilled();

    void setFilled(boolean b);

    int getLineThickness();

    void setLineThickness(int thickness);

    boolean isMovepoint(Point point);

    int isResizepoint(Point Point);

    Point getMovePoint();

    boolean equals(Object a);

    public ShapeInterface copy();

    boolean intialized();

}
