package repeat.chapters.chapter14;

public class Point2D extends Point {
    private double y;

    public Point2D() {
//        super();        //Ws 1h entolh kalei ton default constructor ths superClass(Point)
//        y = 0;
    }

    public Point2D(double x, double y) {
        super(x);  //kalei ton overloaded constructor ths Point
//        this.setX(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    //liskov subsitution principle
    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public String toString() {
        return super.toString() + "(" + y + ")";
    }

    //    @Override
//    public String pointToString() {
//        return super.pointToString() + "(" + y + ")";
//    }
}
