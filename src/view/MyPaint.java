package view;

import model.MyShape;

import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

/**
 * @author Raffy
 */
public class MyPaint extends Canvas {

    private static MyPaint paint = null;
    public static ArrayList<MyShape> shapes = new ArrayList<>();
    private static Stack<ArrayList<MyShape>> Redo = new Stack<>();
    public static Stack<ArrayList<MyShape>> Undo = new Stack<>();

    private MyPaint() {
        setSize(770, 770);
        setBackground(Color.white);
    }

    public static MyPaint getInstance() {
        if (paint == null) {
            paint = new MyPaint();
        }
        return paint;
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        shapes.stream().map((shape) -> {
            g2.setColor(shape.getColor());
            return shape;
        }).forEach((shape) -> shape.paint(g2));
    }

    void unDo() {
        if (Undo.size() >= 2) {
            Redo.push(Undo.pop());
            shapes = new ArrayList<>(Undo.peek());
        } else if (Undo.size() == 1) {
            Redo.push(Undo.pop());
            shapes = new ArrayList<>();
        }
        this.repaint();
    }

    void reDo() {
        if (Redo.size() >= 2) {
            Undo.push(Redo.pop());
            shapes = new ArrayList<>(Undo.peek());
        } else if (Redo.size() == 1) {
            Undo.push(Redo.pop());
            shapes = new ArrayList<>(Undo.peek());
        }
        this.repaint();
    }

}
