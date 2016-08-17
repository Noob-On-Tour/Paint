package controller;

import observer.paintListener;
import view.MyJFrame;
import view.MyPaint;

public class Controller {

    public static void main(String[] args) {
        MyJFrame jFrame = new MyJFrame();
        MyPaint paint = MyPaint.getInstance();
        paintListener pl = new paintListener();
        paint.addMouseListener(pl);
        jFrame.add(paint);
        jFrame.setVisible(true);
    }

}
